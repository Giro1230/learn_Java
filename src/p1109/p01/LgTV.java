package p1109.p01;

public class LgTV implements ITV{
    @Override
    public void on() {
        System.out.println("LG TV 전원을 올립니다.");
    }

    @Override
    public void off() {
        System.out.println("LG TV 전원을 내립니다.");
    }

    @Override
    public void up() {
        System.out.println("LG TV 볼륨을 올립니다.");
    }

    @Override
    public void down() {
        System.out.println("LG TV 볼륨을 내립니다.");
    }
}
