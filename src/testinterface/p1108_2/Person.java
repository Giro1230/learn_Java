package testinterface.p1108_2;

public class Person implements IAnimal{
    @Override
    public void work() {
        System.out.println("사람은 걷습니다.");
    }

    @Override
    public void eat() {
        System.out.println("사람은 먹습니다.");
    }

    @Override
    public void sleep() {
        System.out.println("사람은 잡니다.");
    }

    public void make(){
        System.out.println("사람은 만듭니다.");
    }
}
