package p1121.member;

public class MemberVO {
	String id;
	String pwd;
	String name;
	String tell;

	public MemberVO() {
	}

	public MemberVO(String id, String pwd, String name, String tell) {
		this.id = id;
		this.pwd = pwd;
		this.name = name;
		this.tell = tell;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pw) {
		this.pwd = pw;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTell() {
		return tell;
	}

	public void setTell(String tell) {
		this.tell = tell;
	}

	@Override
	public String toString() {
		return 	"id : " + id + ", " +
				"pwd : " + pwd + ", " +
				"name : " + name + ", " +
				"tell : " + tell;
	}
}
