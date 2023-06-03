package chap04;

class Member{
    private String id;
    private String pwd;
    private String name;

    @Override
    public String toString() {
        return "id: " + id + "\n" + "pwd: " + pwd + "\n" + "name: " + name + "\n";
    }
}

class MemberTest{
    public static void main(String[] args) {
        Member m = new Member();
        System.out.println(m);
        System.out.println(m.toString());
    }
}