package chap02;

public class Student {
    int age;
    String name;

    Student(){
        this(0,"NULL");
    }

    Student(int age, String name){
        this.age = age;
        this.name = name;
    }

    void showInfo(){
        System.out.printf("age : %d\nname : %s\n",age, name);
    }

}
