package remotecontrol;

public class Bicycle {
    boolean on;

    public void turnOn() {
        on = true;
        System.out.println("라이트를 켰습니다.");
    }

    public void turnOff() {
        on = false;
        System.out.println("라이트를 껐습니다.");
    }
}
