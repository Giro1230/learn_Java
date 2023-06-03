package p1121.member;

import java.sql.*;

public class MemberMain {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// MemberVO 객체 생성
		MemberVO mv = new MemberVO();
		//MemberVO 객체에 데이터 저장
		mv.setId("ccc");
		mv.setPwd("ccc");
		mv.setTell("010-1111-1111");
		mv.setName("마이콜");
		//JDBC 프로그래밍을 통해 myDB 데이터베이스의 member 테이블에 회원정보 저장
		//1.DB 접속 2.쿼리 실행
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/myDB",
				"root", "6725");
		Statement stmt = conn.createStatement();

		StringBuffer temp = new StringBuffer();
		temp.append("INSERT INTO member (id, pwd, userName, tell) VALUES ('");
		temp.append(mv.getId());
		temp.append("', '");
		temp.append(mv.getPwd());
		temp.append("', '");
		temp.append(mv.getName());
		temp.append("', '");
		temp.append(mv.getTell());
		temp.append("')");

		boolean result = stmt.execute(String.valueOf(temp));
		System.out.println(result);

		String query_select = "SELECT * FROM member";
		ResultSet rs = stmt.executeQuery(query_select);




		//JDBC 프로그래밍을 통해 myDB 데이터베이스의 member 테이블의 회원정보 조회
		//조회된 결과를 MemberVO 객체에 담기
		// MemberVO 객체 화면 출력
		//JDBC 프로그래밍을 통해 myDB 데이터베이스의 member 테이블에 회원정보 저장

	}
}

