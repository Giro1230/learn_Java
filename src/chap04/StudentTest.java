package chap04;

import java.util.ArrayList;
import java.util.Scanner;

class Student{
    private String name;
    private String sno;
    private static int count = 0;
    private ArrayList<subject> subss = new ArrayList<subject>();

    Student(String name){
        this.name = name;
        count++;
    }

    public void setSno(String sno) {
        this.sno = sno;
    }

    public String getName() {
        return name;
    }

    public String getSno() {
        return sno;
    }

    public static int getCount() {
        return count;
    }

    void setSubject(String subName, int score) {
        subject ud = new subject(subName, score);
        subss.add(ud);
    }

    int totalScore(int classNum){
        int totalScore = 0;
        for (int i = 0; i < classNum; i++) {
            totalScore += subss.get(i).getScore();
        }
        return totalScore;
    }

    double nScore(int classNum){
        double nScore = totalScore(classNum) / classNum;
        return nScore;
    }

    int classTotalScore(Student[] std){
        int classTotalScore = 0;
        for (int i = 0; i < std.length; i++) {
            classTotalScore += subss.get(i).getScore();
        }
        return classTotalScore;
    }

    @Override
    public String toString() {
        return  "name='" + name + '\'' +
                ", sno='" + sno + '\'' +
                ", subss=" + subss.toString();
    }
}

class subject{
    private String name;
    private int score;

    subject(String name, int score) {
        this.name = name;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public int getScore() {
        return score;
    }

    @Override
    public String toString() {
        return  '{' + "name='" + name + '\'' +
                ", score=" + score +
                '}';
    }
}

class StudentTest{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("학생수를 입력하세요 >> ");
        int stdNum = sc.nextInt();
        System.out.println();
        Student[] std = new Student[stdNum];

        System.out.print("학교 앞 이니셜을 입력해주세요 >> ");
        String sno = sc.next();
        System.out.println();

        System.out.print("이름을 입력해주세요 >> ");
        String name = sc.next();
        System.out.println();

        System.out.print("과목 갯수을 입력해주세요 >> ");
        int classNum = sc.nextInt();
        System.out.println();

        for (int i = 0; i < stdNum; i++) {
            std[i] = new Student(name);

            for (int j = 0; j < classNum; j++) {
                System.out.print("과목을 입력해주세요 >> ");
                String className = sc.next();

                System.out.print("점수를 입력해주세요 >> ");
                int score = sc.nextInt();

                std[i].setSubject(className, score);
            }
            System.out.println();

            System.out.println(std[i].toString());
            std[i].totalScore(classNum);
        }
        int classTotalScore = std[0].classTotalScore(std);
        System.out.println(classTotalScore);
    }
}