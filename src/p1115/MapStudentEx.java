package p1115;

import java.util.HashMap;
import java.util.Scanner;

class Student{
    private int id;
    private String tel;

    public Student(int id, String tel){
        this.id = id;
        this.tel = tel;
    }

    public int getId() {
        return id;
    }

    public String getTel() {
        return tel;
    }

    @Override
    public String toString() {
        return  "id : " + id + "\t" +
                "tel : " + tel;
    }
}

public class MapStudentEx {
    public static void main(String[] args) {
        //  (학생이름, Student 객체)를 저장하는 해시맵 생성
        Scanner sc = new Scanner(System.in);
        var studentMap = new HashMap<String, Student>();

        //  3명의 학생 저장하기
        studentMap.put("홍길동", new Student(1, "010-1111-1111"));
        studentMap.put("임꺽정", new Student(2, "010-2222-2222"));
        studentMap.put("일지매", new Student(3, "010-3333-3333"));

        while (true) {
            System.out.print("학생 이름 : ");
            String name = sc.next();
            if (name.equalsIgnoreCase("exit")){
                System.out.println("종료합니다.");
                break;
            } else if (studentMap.get(name) == null){
                System.out.println(name + "은(는) 없는 사람입니다.");
            } else {
                System.out.println(studentMap.get(name));
            }
        }

        sc.close();
    }
}
