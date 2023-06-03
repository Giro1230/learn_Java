package p1109.p02;

public class SonySpeaker implements ISpeaker{
    @Override
    public void volumeUp() {
        System.out.println("소니 스피커 볼윰 올림");
    }

    @Override
    public void volumeDown() {
        System.out.println("소니 스피커 볼윰 내림");
    }
}
