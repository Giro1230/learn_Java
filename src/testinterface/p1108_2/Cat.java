package testinterface.p1108_2;

public class Cat implements IAnimal{
    @Override
    public void work() {
        System.out.println("고양이는 걷습니다.");
    }

    @Override
    public void eat() {
        System.out.println("고양이는 먹습니다.");
    }

    @Override
    public void sleep() {
        System.out.println("고양이는 잡니다.");
    }

    public void claw(){
        System.out.println("고양이는 할큅니다.");
    }
}
