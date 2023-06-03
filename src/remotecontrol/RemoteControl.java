package remotecontrol;

public interface RemoteControl {
    int n = 10;

//  추상메소드
    public void turnOn();
    public void turnOff();


    public default void printBrand(){
        System.out.println("리모트 컨트롤이 가능한 제품입니다.");
    }
}
