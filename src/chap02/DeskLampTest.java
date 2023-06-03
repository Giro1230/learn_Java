package chap02;

public class DeskLampTest {
    public static void main(String[] args) {
        DeskLamp myLamp = new DeskLamp();

        myLamp.turnOn();
        System.out.println(myLamp.getStatus());
        
        myLamp.f();
        System.out.println(myLamp.getStatus());

        DeskLamp youDeskLamp = new DeskLamp(true);
        System.out.println(youDeskLamp.getStatus());
    }
}
