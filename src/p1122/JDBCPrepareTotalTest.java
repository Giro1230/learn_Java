package p1122;

import p1121.member.MemberVO;

import java.sql.*;
import java.util.ArrayList;

class DBcon{
    String url = "jdbc:mysql://localhost:3306/myDB";
    String uid = "root";
    String upw = "6725";
    Connection con = null;
    public void DBConnection() throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        this.con = DriverManager.getConnection(url, uid, upw);
    }

    public void DBDisConnection() throws SQLException {
        this.con.close();
    }

    public Connection getCon() {
        return con;
    }
}

public class JDBCPrepareTotalTest {
    PreparedStatement pstmt = null;
    ResultSet rs = null;

    DBcon db = new DBcon();
    public void insert(MemberVO member) throws ClassNotFoundException, SQLException {
        db.DBConnection();

        String query = "INSERT INTO member(id, pw, userName, tell)"
                        + "VALUES (?, ?, ?, ?)";
        pstmt = db.getCon().prepareStatement(query);
        pstmt.setString(1, member.getId());
        pstmt.setString(2, member.getPwd());
        pstmt.setString(3, member.getName());
        pstmt.setString(4, member.getTell());
        int r = pstmt.executeUpdate();


        if (r == 1) {
            System.out.println("저장되었습니다.");
        }
    }

    public ArrayList<MemberVO> selectAll() throws SQLException, ClassNotFoundException {
        db.DBConnection();
        ArrayList<MemberVO> list = new ArrayList<>();

        String query = "SELECT * FROM member";
        pstmt = db.getCon().prepareStatement(query);
        rs = pstmt.executeQuery();

        while (rs.next()) {
            MemberVO m = new MemberVO();
            m.setId(rs.getString("id"));
            m.setPwd(rs.getString("pw"));
            m.setName(rs.getString("userName"));
            m.setTell(rs.getString("tell"));
            list.add(m);
        }
        return list;
    }

    public MemberVO selectOne(String id) throws SQLException, ClassNotFoundException {
        db.DBConnection();
        String query = "SELECT * FROM member WHERE id = ?";
        pstmt = db.getCon().prepareStatement(query);
        pstmt.setString(1, id);
        rs = pstmt.executeQuery();

        MemberVO m = new MemberVO();
        while (rs.next()) {
            m.setId(rs.getString("id"));
            m.setPwd(rs.getString("pw"));
            m.setName(rs.getString("userName"));
            m.setTell(rs.getString("tell"));
        }

        return m;
    }

    public ArrayList<MemberVO> selectLike(String name) throws SQLException, ClassNotFoundException {
        db.DBConnection();
        ArrayList<MemberVO> list = new ArrayList<>();

        String query = "SELECT userName FROM member WHERE userName like '%씨'";
        pstmt = db.getCon().prepareStatement(query);
        rs = pstmt.executeQuery();

        while (rs.next()) {
            MemberVO m = new MemberVO();
            m.setId(rs.getString("id"));
            m.setPwd(rs.getString("pw"));
            m.setName(rs.getString("userName"));
            m.setTell(rs.getString("tell"));
            list.add(m);
        }
        return list;
    }

    public void update(MemberVO member) throws SQLException, ClassNotFoundException {
        db.DBConnection();

        String query = "UPDATE member set pw = ?, userName = ?, tell = ? WHERE id = ?";
        pstmt = db.getCon().prepareStatement(query);
        pstmt.setString(1, member.getPwd());
        pstmt.setString(2, member.getName());
        pstmt.setString(3, member.getTell());
        pstmt.setString(4, member.getId());

        int result = pstmt.executeUpdate();
        if (result != 0) {
            System.out.println("업데이트가 완료되었습니다.");
        }
    }

    public void delete(String id) throws SQLException, ClassNotFoundException {
        db.DBConnection();

        String query = "DELETE FROM member WHERE id=?";
        pstmt = db.getCon().prepareStatement(query);
        pstmt.setString(1, id);
        int result = pstmt.executeUpdate();

        if (result != 0) {
            System.out.println("삭제가 완료되었습니다.");
        }
    }

    public boolean idCheck(String id) throws SQLException, ClassNotFoundException {
        db.DBConnection();

        boolean result = true;

        String query = "SELECT COUNT(id) AS CNT FROM member WHERE id = ?";
        pstmt = db.getCon().prepareStatement(query);
        pstmt.setString(1, id);
        rs = pstmt.executeQuery();

        while (rs.next()) {
            if (rs.getInt(1) > 0) {
                result = true;
            } else if(rs.getInt(1) == 0){
                result = false;
            }
        }
        return result;
    }

    public boolean loginCheck(String id, String pwd) throws SQLException, ClassNotFoundException {
        MemberVO m = selectOne(id);
        return m.getPwd().equalsIgnoreCase(pwd);
    }
}
