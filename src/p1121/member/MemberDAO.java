package p1121.member;

import java.sql.*;
import java.util.ArrayList;

public class MemberDAO {
    Connection conn;
    Statement stmt;

    PreparedStatement pstmt;
    ResultSet rs;
    final String url = "jdbc:mysql://localhost:3306/myDB";
    final String uid = "root";
    final String upw = "6725";
    final String driver = "com.mysql.cj.jdbc.Driver";

    public Connection dbConnection() throws Exception{
        Class.forName(driver);
        conn = DriverManager.getConnection(url, uid, upw);
        return conn;
    }

    public void insert(MemberVO member) throws Exception {
        stmt = conn.createStatement();
        String query = "INSERT INTO member(id, pwd, userName, tell) VALUES ('"
                + member.getId() + "', '"
                + member.getPwd() + "', '"
                + member.getName() + "', '"
                + member.getTell() + "')";
        stmt.executeUpdate(query);
        String query_select = "SELECT * FROM member";
        rs = stmt.executeQuery(query_select);
    }

    public ArrayList<MemberVO> selectAll() throws SQLException {
        ArrayList<MemberVO> list = new ArrayList<>();

        while (rs.next()){
            MemberVO m = new MemberVO();
            m.setId(rs.getString("id"));
            m.setPwd(rs.getString("pw"));
            m.setName(rs.getString("userName"));
            m.setTell(rs.getString("tell"));
            list.add(m);
        }
        return list;
    }

    public MemberVO selectOne(String id) throws SQLException {
        MemberVO m = new MemberVO();

        while (rs.next()) {
            if (rs.getString("id").equals(id)){
                m.setId(rs.getString("id"));
                m.setPwd(rs.getString("pw"));
                m.setName(rs.getString("userName"));
                m.setTell(rs.getString("tell"));
            }
        }
        return m;
    }

    public void update(MemberVO member) throws SQLException {
        while (rs.next()) {
            if (rs.getString("id").equals(member.getId())) {
                rs.updateObject(member.getId(), member);
            }
        }
    }

    public void delete(String id) throws SQLException {
        while (rs.next()) {
            if (rs.getString("id").equals(id)) {

            }
        }
    }
}
