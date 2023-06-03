package p1121.JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCInsertTest {

	public static void main(String[] args) {
		//1, DB 접속(Connection) 준비
		Connection conn;
		//2. 쿼리 실행 (Statement)준비
		Statement stmt;
		//DB 접속을 위한 주소, 아이디, 패스워드 준비
		String url = "jdbc:mysql://localhost:3306/myDB";
		String uid = "root";
		String upw = "6725";
		String query = "INSERT INTO test(c1,c2) VALUES (10,'jane')";
		try {
			//db 접속을 위한 클래스 로드 (Driver)
			Class.forName("com.mysql.cj.jdbc.Driver");
			//Driver 객체를 이용한 접속객체 얻기(getConnection 메소드)
			conn =DriverManager.getConnection(url,uid,upw);
			//쿼리실행을 위한 객체 Statement  를 생성하자.
			stmt = conn.createStatement();
			//쿼리실행객체의 메소드를 이용해서 쿼리를 실행하자.
			//insert 쿼리는 db의 갱신을 초래하므로 executeUpdate() 메소드를 사용하자.
			int result = stmt.executeUpdate(query);

			if(result==1) {
				System.out.println("추가 완료!!");
			}
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}
}
