package p1109.p03.vo;

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
        con = DriverManager.getConnection(url, uid, upw);
    }

    public void DBDisConnection() throws SQLException {
        con.close();
    }
}

public class JDBC {
    Connection con = null;
    PreparedStatement pstmt = null;
    Statement stmt = null;
    ResultSet rs = null;

    DBcon db = new DBcon();
    public void insert(MemberVO member) throws ClassNotFoundException, SQLException {
        db.DBConnection();

        String query = "INSERT INTO member(id, pwd, userName, tell)"
                        + "VALUES (id = ?, pwd = ?, userName = ?, tell = ?)";
        pstmt = con.prepareStatement(query);
        pstmt.setString(1, member.getId());
        pstmt.setString(2, member.getPwd());
        pstmt.setString(3, member.getName());
        pstmt.setString(4, member.getTell());
        int result = pstmt.executeUpdate();

        if (result == 1) {
            System.out.println("저장되었습니다.");
        }
        db.DBDisConnection();
    }

    public ArrayList<MemberVO> selectAll() throws SQLException, ClassNotFoundException {
        db.DBConnection();
        ArrayList<MemberVO> list = new ArrayList<>();

        String query = "SELECT * FROM member";
        pstmt = con.prepareStatement(query);
        rs = pstmt.executeQuery();

        while (rs.next()) {
            MemberVO m = new MemberVO();
            m.setId(rs.getString("id"));
            m.setPwd(rs.getString("pwd"));
            m.setName(rs.getString("userName"));
            m.setTell(rs.getString("tell"));
            list.add(m);
        }
        db.DBDisConnection();
        return list;
    }

    public MemberVO selectOne(String id) throws SQLException, ClassNotFoundException {
        db.DBConnection();
        String query = "SELECT id FROM member WHERE id=?";
        pstmt = con.prepareStatement(query);
        pstmt.setString(1, id);
        rs = pstmt.executeQuery();

        MemberVO m = new MemberVO();
        while (rs.next()) {
            m.setId(rs.getString("id"));
            m.setPwd(rs.getString("pwd"));
            m.setName(rs.getString("userName"));
            m.setTell(rs.getString("tell"));
        }
        db.DBDisConnection();
        return m;
    }

    public ArrayList<MemberVO> selectLike(String name) throws SQLException, ClassNotFoundException {
        db.DBConnection();
        ArrayList<MemberVO> list = new ArrayList<>();

        String query = "SELECT userName FROM member WHERE userName like '%씨'";
        pstmt = con.prepareStatement(query);
        rs = pstmt.executeQuery();

        while (rs.next()) {
            MemberVO m = new MemberVO();
            m.setId(rs.getString("id"));
            m.setPwd(rs.getString("pwd"));
            m.setName(rs.getString("userName"));
            m.setTell(rs.getString("tell"));
            list.add(m);
        }
        db.DBDisConnection();
        return list;
    }

    public void update(MemberVO member) throws SQLException, ClassNotFoundException {
        db.DBConnection();

        String query = "UPDATE member set pwd = ?, userName = ?, tell = ? WHERE id = ?";
        pstmt = con.prepareStatement(query);
        pstmt.setString(1, member.getPwd());
        pstmt.setString(2, member.getName());
        pstmt.setString(3, member.getTell());
        pstmt.setString(4, member.getId());

        int result = pstmt.executeUpdate();
        if (result != 0) {
            System.out.println("업데이트가 완료되었습니다.");
        }
        db.DBDisConnection();
    }

    public void delete(String id) throws SQLException, ClassNotFoundException {
        db.DBConnection();

        String query = "DELETE FROM member WHERE id=?";
        pstmt = con.prepareStatement(query);
        pstmt.setString(1, id);
        int result = pstmt.executeUpdate();

        if (result != 0) {
            System.out.println("삭제가 완료되었습니다.");
        }
        db.DBDisConnection();
    }

    public boolean idCheck(String id) throws SQLException, ClassNotFoundException {
        db.DBConnection();

        boolean result = true;

        String query = "SELECT COUNT(id) AS CNT FROM member WHERE id = ?";
        pstmt = con.prepareStatement(query);
        pstmt.setString(1, id);
        rs = pstmt.executeQuery();

        while (rs.next()) {
            if (rs.getInt(1) > 0) {
                result = false;
            } else {
                result = true;
            }
        }
        db.DBDisConnection();
        return result;
    }

    public boolean loginCheck(String id, String pwd) throws SQLException, ClassNotFoundException {
        MemberVO m = selectOne(id);
        boolean result = false;
        if (m.getPwd().equals(pwd)) {
            result = true;
        }
        return result;
    }
}
