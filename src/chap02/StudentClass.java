package chap02;

public class StudentClass {
    private int studentNumber;
    private String studentName;
    private int grade;
    private int clas;

    public StudentClass(){

    }
    
    public StudentClass(int studentNumber, String studentName) {
        this.studentNumber = studentNumber;
        this.studentName = studentName;
    }
    
    public StudentClass(int studentNumber, String studentName, int grade, int clas) {
        this.studentNumber = studentNumber;
        this.studentName = studentName;
        this.grade = grade;
        this.clas = clas;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }
    public void setStudentNumber(int studentNumber) {
        this.studentNumber = studentNumber;
    }
    public void setGrade(int grade) {
        this.grade = grade;
    }
    public void setClas(int clas) {
        this.clas = clas;
    }

    public void showInfo(){
        System.out.printf("Number : %d\nName : %s\nGrade : %d\nclas : %d\n",studentNumber,studentName,grade,clas);
    }
}
