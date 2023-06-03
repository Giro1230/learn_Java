package p1109.p02;

public class AppleSpeaker implements ISpeaker{
    @Override
    public void volumeUp() {
        System.out.println("애플 스피커 볼륨 올림");
    }

    @Override
    public void volumeDown() {
        System.out.println("애플 스피커 볼륨 내림");
    }
}
