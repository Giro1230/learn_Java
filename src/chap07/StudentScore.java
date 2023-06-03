package chap07;

import java.util.ArrayList;

class StudentScore extends Human{
    static int sno = 0;
    ArrayList<Subject> subjects = new ArrayList<Subject>();

    StudentScore(String name){
        super(name);
        sno++;
    }

    public void setPwdStudent(String pwd) {
        super.setPwd(pwd);
    }

    public void subjects(String clasName, int score) {
        subjects(clasName, score);
    }


}