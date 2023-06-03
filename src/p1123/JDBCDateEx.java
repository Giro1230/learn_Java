package p1123;

import java.sql.*;

public class JDBCDateEx {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/myDB";
        String uid = "root";
        String upw = "6725";
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(url, uid, upw);
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM dateex");
            rs.next();
            //  dateex 테이블의 d1열의 데이터를 java 에서 어떤 타입으로 받을수 있나.
            java.util.Date date = rs.getDate(1);
            java.sql.Date date2 = rs.getDate(1);
            String d = rs.getString(1);
            java.util.Date d2 = rs.getTimestamp(1);
            // java.sql.Date d3 = rs.getTimestamp(1); 얘는 안된다.
            // 안되는 이유는 시분초 까지 나오는데 출력문에서는 시분초가 나오지 않기 때문에 데이터의 크기가 안맞다.
            java.sql.Timestamp d3 = rs.getTimestamp(1); //  얘는 된다.

            System.out.println(rs.getDate(1));
            System.out.println(rs.getTimestamp(2));
            System.out.println(rs.getString(1));
            System.out.println(rs.getString(2));
            System.out.println(rs.getTimestamp(1));
            System.out.println(rs.getDate(2));

        } catch (ClassNotFoundException e){
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
