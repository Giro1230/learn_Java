package testinterface;

interface  Employable{
    String getName();
    static boolean isEmpty(String name){
        if(name == null || name.trim().length() == 0){
            return true;
        }else {
            return false;
        }
    }
}

class Employee implements Employable {

    private String name;
    Employee(String name){
        if (Employable.isEmpty(name)) {
            System.out.println("이름은 반드시 입력해야 함!");
        }

        this.name = name;
    }

    @Override
    public String getName() {
        return this.name;
    }
}

public class StaticMethodTest2 {
    public static void main(String[] args) {
        Employable employee1 = new Employee("홍길동");
    }
}
