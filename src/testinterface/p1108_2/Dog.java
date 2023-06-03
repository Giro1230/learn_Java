package testinterface.p1108_2;

public class Dog implements IAnimal{
    @Override
    public void work() {
        System.out.println("개는 걷습니다.");
    }

    @Override
    public void eat() {
        System.out.println("개는 먹습니다.");
    }

    @Override
    public void sleep() {
        System.out.println("개는 잡니다.");
    }
    public void bark(){
        System.out.println("개는 짖습니다.");
    }
}
