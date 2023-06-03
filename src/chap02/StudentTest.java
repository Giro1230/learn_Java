package chap02;

public class StudentTest {
    public static void main(String[] args) {
        Student st01 = new Student(5, "홍길동");
        Student st02 = new Student();

        st01.showInfo();
        st02.showInfo();
    }
}
