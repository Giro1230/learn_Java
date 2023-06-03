package chap07;

class Human {
    String name;
    String pwd = "1234";

    Human(String name) {
        this.name = name;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }
}
