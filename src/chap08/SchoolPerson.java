package chap08;

class SchoolPerson{
    private String name;

    SchoolPerson(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

class Student extends SchoolPerson {
    //    static : class가 선언되면 할당되는 메모리에 static을 선언 하게 되면 따로 한 공간이 생기면서
//    선언된부분들은 할당된 메모리에서 삭제되고 한곳에 단 하나만 생성이 된다.
    private static int sno = 0;
    private int no = sno;
    private int grade;

//    Student() {
//        super("이지금");
//        this.grade = 3;
//        sno++;
//    }

    private Student(String name, int grade) {
        super(name);
        this.grade = grade;
        ++sno;
    }

    @Override
    public String toString() {
        return "Student  " + "Num : " + no + " name : " + getName() + "\t" + "Grade : " + grade;
    }

    static Student getStudent(String name, int grade) {
        return new Student(name, grade);
    }

}

class Teacher extends SchoolPerson{
    private String subClass;
    private static int tno;
    private int no = tno;

    Teacher(){
        super("김유이");
        this.subClass = "Java";
        ++tno;
    }

    Teacher(String name, String subClass){
        super(name);
        this.subClass = subClass;
        tno++;
    }

    @Override
    public String toString() {
        return   "Teacher  "+ "Num : "+ no + " Name : " + getName() + "\t" + "Class : " + subClass;
    }
}

class StudentTest{
    public static void main(String[] args){
        String name = "김유이";
        int grade = 3;

        Student student = Student.getStudent("이지금", 3);
        Student student2 = student;
        System.out.println(student);
        System.out.println(student2);
        System.out.println(student2 == student);

//        Student student2 = student;
//        student2.setStudent(name, grade);
//        System.out.println(student2);

        System.out.println("");


        Teacher teacher = new Teacher();
        System.out.println(teacher);

        Teacher teacher2 = new Teacher("이지금", "SQL");
        System.out.println(teacher2);
    }
}