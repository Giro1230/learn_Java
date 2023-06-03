package chap02;

import chap02.StudentClass;

public class StudentClassTest {
    public static void main(String[] args) {
        StudentClass bc = new StudentClass();
        bc.setStudentNumber(22);
        bc.setStudentName("Luna");
        bc.setGrade(2);
        bc.setClas(5);
        bc.showInfo();
        
        StudentClass ssc = new StudentClass(20, "Bella");
        ssc.setGrade(4);
        ssc.setClas(7);
        ssc.showInfo();
        
        StudentClass sc = new StudentClass(5, "John", 3, 5);
        sc.showInfo();
        
    }
}
