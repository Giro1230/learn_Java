package p1122;

import java.sql.*;

public class JDBCPrepareTest7 {
    public static void main(String[] args) throws SQLException {
        //  1. DB 접속
        //  2. 쿼리 실행
        String url = "jdbc:mysql://localhost:3306/myDB";
        String uid = "root";
        String upw = "6725";
        String x = "aaa";
        Connection con = DriverManager.getConnection(url, uid, upw);
        PreparedStatement pstmt = null;
        ResultSet rs = null;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String query = "SELECT COUNT(id) AS CNT FROM member WHERE id = ?";
            pstmt = con.prepareStatement(query);
            pstmt.setString(1, x);
            rs = pstmt.executeQuery();

            while (rs.next()) {
                if (rs.getInt(1) > 0) {
                    System.out.println("아이디가 중복입니다");
                }
            }


        } catch (SQLException e){
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
