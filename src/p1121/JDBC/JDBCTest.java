package p1121.JDBC;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCTest {
	public static void main(String[] args) throws SQLException {
		//접속 개체 얻기 - 주소, 아이디, 패스워드
		Connection conn = null;
		Statement stmt = null;
		String url = "jdbc:mysql://localhost:3306/myDB";
		String uid = "root";
		String upw = "6725";


		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection(url,uid,upw);

			if(conn != null) {
				System.out.println("DB 접속 성공");
			}else {
				System.out.println("접속 실패");
			}
		}catch (ClassNotFoundException e) {
			System.out.println("db에 접속에 필요한 클래스를 찾지못함");
			e.printStackTrace();
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}

		}

	}
}
