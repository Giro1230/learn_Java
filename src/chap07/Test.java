package chap07;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DB db = new DB();
        Teacher t = new Teacher("김유이","Java");
        db.regTeacherInfo(t);

        int memberChoice = 0;

        while ( memberChoice < 3) {
            System.out.println("학생인지 선생님인지 선택해주세요");
            System.out.println("1. 선생님\t2. 학생\t3. 종료");
            memberChoice = sc.nextInt();
            if (memberChoice == 3) {
                break;
            }

            System.out.print("아이디가 있다면 1번, 없다면 2번을 눌러주세요 >> ");
            int num = sc.nextInt();

            if (memberChoice == 1 && num == 1) {
                for (int i = 0; i < 5; i++) {
                    System.out.print("이름 : ");
                    String teacherName = sc.next();

                    System.out.print("비밀번호 : ");
                    String teacherPwd = sc.next();

                    boolean check = db.loginCheckByTeacher(teacherName, teacherPwd);
                    System.out.println();

                    if (check) {
                        System.out.println("로그인 되었습니다.");
                        System.out.println("원하는 기능을 선택해 주세요");
                        System.out.print("1. 학생성적 입력\t2. 학생성적 정정\t3. 종료");
                        int cNum = sc.nextInt();
                        while (cNum < 3) {
                            switch (cNum) {
                                case 1 :
                                    System.out.print("학생의 이름과 점수를 입력해주세요 >> ");
                                    String name = sc.next();
                                    int score = sc.nextInt();

                                    StudentScore ss = new StudentScore(name);
                                    ss.subjects(db.teacher.clasName, score);
                                    db.regStudentInfo(ss);
                                    break;

                                case 2:
                                    System.out.print("학생번호를 입력해주세요 >> ");
                                    int sno = sc.nextInt();
                                    StudentScore s2 = db.list.get(sno);

                                    System.out.print("점수를 수정해주세요 >> ");
                                    int score2 = sc.nextInt();
                                    s2.subjects(db.teacher.clasName, score2);
                                    db.updateStudentInfo(s2, sno);

                                case 3 :
                                    break;
                            }
                        }
                    }
                }
            } else if (memberChoice==1 && num == 2) {
                System.out.print("이름을 입력해주세요 >> ");
                String teacherName = sc.next();
                System.out.print("과목을 입력해주세요 >> ");
                String teacherClas = sc.next();

                Teacher teacher = new Teacher(teacherName, teacherClas);
                db.regTeacherInfo(teacher);
                System.out.println("처음으로 돌아갑니다.");
            } else if (memberChoice == 2 && num == 1){
                System.out.print("학번 : ");
                int no = sc.nextInt();

                System.out.print("비밀번호 : ");
                String pwd = sc.next();

                db.loginCheckByStudent(no, pwd);

                db.getStudentInfo(no);
            } else if (memberChoice == 2 && num == 2) {
                System.out.print("이름 : ");
                String name = sc.next();

                StudentScore s = new StudentScore(name);
                System.out.println("학번 : " + s.sno + "비밀번호 : " + s.pwd);

                db.regStudentInfo(s);
            }
        }
    }
}
