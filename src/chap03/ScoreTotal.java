package chap03;

import java.util.Scanner;

class Student{
    private String sno = "H-";
    private String name = "";
    private Subject[] subs = new Subject[3];

    public Student(){}

    public Student(String name){
        this.name = name;
    }

    public void setJava(int score){
        subs[0] = new Subject("Java", score);
    }

    public void setC(int score){
        subs[1] = new Subject("C", score);
    }

    public void setSQL(int score){
        subs[2] = new Subject("SQL", score);
    }

    public String getSno() {
        return sno;
    }

    public int totalScore(){
        int score = 0;
        for (int i = 0; i < subs.length; i++) {
            score += subs[i].getScore();
        }
        return score;
    }
}


class Subject{
    private String className;
    private int score;
    public Subject(){}
    public Subject(String className, int score){
        this.className = className;
        this.score = score;
    }

    public int getScore() {
        return score;
    }
}

public class ScoreTotal {
    public static void main(String[] args) {
        int cnt = 0;

        Student[] std = new Student[10];
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < std.length; i++) {
            System.out.print("학생 이름 : ");
            String name = sc.next();

            System.out.print("Java 점수 : ");
            int scoreJava = sc.nextInt();

            System.out.print("C 점수 : ");
            int scoreC = sc.nextInt();

            System.out.print("SQL 점수 : ");
            int scoreSQL = sc.nextInt();

            std[i] = new Student(name);
            cnt++;
            std[i].setJava(scoreJava);
            std[i].setC(scoreC);
            std[i].setSQL(scoreSQL);

            int totalScore = std[i].totalScore();

            System.out.println(std[i].getSno()+ cnt +"학번 "+ name + " 의 총점 : " + totalScore);
            System.out.println();
        }

        sc.close();
    }
    
}
