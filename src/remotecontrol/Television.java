package remotecontrol;

public class Television implements RemoteControl, AdvancedRemoteControl{
    boolean on;

    @Override
    public void turnOn() {
        on = true;
        System.out.println("TV가 켜졌습니다.");
    }

    @Override
    public void turnOff() {
        on = false;
        System.out.println("TV가 꺼졌습니다.");
    }

    @Override
    public void printBrand() {
        System.out.println("리모트 컨트롤이 가능한 TV입니다.");
    }

    @Override
    public void volumeUp() {
        System.out.println("TV 소리를 높였습니다.");
    }

    @Override
    public void volumeDown() {
        System.out.println("TV 소리를 낮췄습니다.");
    }
}
