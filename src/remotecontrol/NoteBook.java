package remotecontrol;

public class NoteBook implements RemoteControl, AdvancedRemoteControl{
    boolean on;
    @Override
    public void turnOn() {
        on = true;
        System.out.println("노트북을 켰습니다.");
    }

    @Override
    public void turnOff() {
        on = false;
        System.out.println("노트북을 껐습니다.");
    }


    @Override
    public void volumeUp() {
        System.out.println("노트북 소리를 높였습니다.");
    }

    @Override
    public void volumeDown() {
        System.out.println("노트북 소리를 낮췄습니다.");
    }
}
