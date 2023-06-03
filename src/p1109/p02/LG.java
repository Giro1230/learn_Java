package p1109.p02;

public class LG implements ITVService{
    @Override
    public void on() {
        System.out.println("엘지 TV 켜짐");
    }

    @Override
    public void off() {
        System.out.println("엘지 TV 꺼짐");
    }

    @Override
    public void vUp() {
        System.out.println("엘지 TV 소리 올림");
    }

    @Override
    public void vDown() {
        System.out.println("엘지 TV 소리 내림");
    }
}
