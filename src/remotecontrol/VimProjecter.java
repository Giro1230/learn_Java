package remotecontrol;

public class VimProjecter implements RemoteControl{
    boolean on;
    @Override
    public void turnOn() {
        on = true;
        System.out.println("빔프로젝터를 켰습니다.");
    }

    @Override
    public void turnOff() {
        on = false;
        System.out.println("빔프로젝터를 껐습니다.");
    }
}
