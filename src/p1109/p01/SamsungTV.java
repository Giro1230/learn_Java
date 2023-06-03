package p1109.p01;

public class SamsungTV implements ITV{

    @Override
    public void on() {
        System.out.println("Samsung TV 전원을 올립니다.");
    }

    @Override
    public void off() {
        System.out.println("Samsung TV 전원을 내립니다.");
    }

    @Override
    public void up() {
        System.out.println("Samsung TV 볼륨을 올립니다.");
    }

    @Override
    public void down() {
        System.out.println("Samsung TV 볼륨을 내립니다.");
    }
}
