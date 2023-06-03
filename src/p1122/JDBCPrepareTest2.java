package p1122;

import java.sql.*;

public class JDBCPrepareTest2 {
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

        String id = "iii";
        String pwd = "1234";
        String name = "하씨";
        String tell = "010-111-1111";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection(url,uid,upw);
            //stmt = conn.createStatement();
//            String query = "INSERT INTO member (id,pwd,userName)"
//                    +"VALUES ('"
//                    +id+"', '"
//                    +pwd+"', '"
//                    +name +"')";
//            int result = stmt.executeUpdate(query);



            String query = "INSERT INTO member(id, pwd, userName, tell)"
                            + "VALUES (?,?,?,?)";
            pstmt = conn.prepareStatement(query);
            pstmt.setString(1, id);
            pstmt.setString(2, pwd);
            pstmt.setString(3, name);
            pstmt.setString(4, tell);

            int result = pstmt.executeUpdate();
            System.out.println("result : " + result);

            String query2 = "SELECT * FROM member WHERE id = ?";
            pstmt = conn.prepareStatement(query2);
//            pstmt.setString(1,"fff");
            rs = pstmt.executeQuery();

            while (rs.next()) {
                System.out.print(rs.getString("id") + ", ");
                System.out.print(rs.getString("pwd") + ", ");
                System.out.print(rs.getString("userName") + ", ");
                System.out.print(rs.getString("tell"));
                System.out.println();
            }

        } catch (SQLException e){
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
