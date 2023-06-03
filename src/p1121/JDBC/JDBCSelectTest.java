package p1121.JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCSelectTest {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		//DB 접속
		//쿼리실행

		//	DB 의 접속을 위한 메소드
		Connection conn;

		//	DB의 정보 갱신을 목적으로 하는 메소드(insert, select, update, delete)
		Statement stmt;

		//	DB 에서 Select 하였을때 그 값을 저장하는 메소드
		ResultSet rs = null;

		String url="jdbc:mysql://localhost:3306/myDB";
		String uid="root";
		String upw="6725";

		// query = 원하는 행동을 시키는것
		String query = "INSERT INTO test(c1, c2) VALUES (1,'yang')";

		Class.forName("com.mysql.cj.jdbc.Driver");
		conn = DriverManager.getConnection(url,uid,upw);
		stmt =conn.createStatement();
		stmt.execute(query);
		rs = stmt.executeQuery("SELECT * FROM myDB.test");

		while(rs.next()) {
			System.out.print(rs.getInt("c1"));
			System.out.print(",");
			System.out.print(rs.getString("c2"));
			System.out.println();
			//인설트는 디비를 바꿔준다
			//쿼리는 디비에 변화를 주지 않는다. //샐랙트만 익스큐트쿼리를 쓴다
			//업데이트는 인설트.
		}
	}

}
