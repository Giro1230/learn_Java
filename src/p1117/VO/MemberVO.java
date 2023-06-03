package p1117.VO;

public class MemberVO {
    int idNumber;
    String id;
    String pwd;
    String name;
    String tell;

    public MemberVO(String id, String pwd, String name, String tell) {
        this.id = id;
        this.pwd = pwd;
        this.name = name;
        this.tell = tell;
        idNumber++;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setTell(String tell) {
        this.tell = tell;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getTell() {
        return tell;
    }

    @Override
    public String toString() {
        return "MemberVO{" +
                "idNumber=" + idNumber +
                ", id='" + id + '\'' +
                ", pwd='" + pwd + '\'' +
                ", name='" + name + '\'' +
                ", tell='" + tell + '\'' +
                '}';
    }
}
