package p1109.p03.vo;

public class MemberVO {
    private String id;
    private String pwd;
    private String name;
    private String tel;

    public MemberVO(String id, String pwd, String name, String tel) {
        this.id = id;
        this.pwd = pwd;
        this.name = name;
        this.tel = tel;
    }

    public String getId() {
        return id;
    }

    public String getPwd() {
        return pwd;
    }

    public String getName() {
        return name;
    }

    public String getTel() {
        return tel;
    }

    @Override
    public String toString() {
        return "MemberVO{" +
                "id='" + id + '\'' +
                ", pwd='" + pwd + '\'' +
                ", name='" + name + '\'' +
                ", tel='" + tel + '\'' +
                '}';
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }
}
