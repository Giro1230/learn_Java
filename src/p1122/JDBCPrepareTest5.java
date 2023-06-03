package p1122;

import java.sql.*;

public class JDBCPrepareTest5 {
    public static void main(String[] args) {
        //  1. DB 접속
        //  2. 쿼리 실행
        Connection conn = null; //  접속객체
        // Statement stmt = null;  //  쿼리실행 객체
        PreparedStatement pstmt = null;
        ResultSet rs = null;    //  결과 집합객체(select 할떄만 필요)
        String url = "jdbc:mysql://localhost:3306/myDB";
        String uid = "root";
        String upw = "6725";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection(url,uid,upw);

            String query2 = "UPDATE member SET pwd = ?, tell = ? WHERE id = ?";
            pstmt = conn.prepareStatement(query2);
            pstmt.setString(1, "1111");
            pstmt.setString(2, "010-1234-1234");
            pstmt.setString(3,"fff");
            pstmt.executeUpdate();

            String query3 = "SELECT * FROM member WHERE id = ?";
            pstmt = conn.prepareStatement(query3);
            pstmt.setString(1,"fff");
            rs = pstmt.executeQuery();

            while (rs.next()) {
                System.out.print(rs.getString("id") + ", ");
                System.out.print(rs.getString("pwd") + ", ");
                System.out.print(rs.getString("userName") + ", ");
                System.out.print(rs.getString("tell"));
            }

        } catch (SQLException e){
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
