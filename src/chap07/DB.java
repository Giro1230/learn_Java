package chap07;

import java.util.ArrayList;

class DB {
    ArrayList<StudentScore> list;
    Teacher teacher;
    DB(){
        list = new ArrayList<StudentScore>();
    }

    void regStudentInfo(StudentScore st) {
        list.add(st);
    }

    void regTeacherInfo(Teacher tc) {
        teacher = new Teacher(tc.name, tc.clasName);
    }

    String getStudentList() {
        return list.toString();
    }

    String getStudentInfo(int sno) {
        return list.get(sno-1).toString();
    }

    void updateStudentInfo(StudentScore st, int sno) {
        list.set(sno-1, st);
    }

    boolean loginCheckByStudent(int no, String pw) {
        boolean check = false;

        for (int i = 0; i < 5; i++) {
            if (list.get(no - 1).sno == no) {
                for (int j = 0; j < list.get(no - 1).pwd.length(); j++) {
                    if (list.get(no - 1).pwd.equals(pw)) {
                        check = true;
                    }
                }
            } else {
                check = false;
            }
        }

        return check;
    }

    boolean loginCheckByTeacher(String name, String pw) {
        boolean check = false;

        if (teacher.name.equals(name)) {
            check = true;
        } else {
            check = false;
        }


        if (check) {
            if (teacher.pwd.equals(pw)) {
                check = true;
            } else {
                check = false;
            }
        } else {
            check = false;
        }

        return check;
    }
}
