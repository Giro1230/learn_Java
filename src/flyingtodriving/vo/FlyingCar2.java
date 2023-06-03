package flyingtodriving.vo;

import flyingtodriving.service.IFlyable;

class Car{
    private int speed;

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getSpeed() {
        return speed;
    }
}

public class FlyingCar2 extends Car implements IFlyable {
    @Override
    public void fly() {
        System.out.println("I'm flying " + super.getSpeed());
    }

    public static void main(String[] args) {
        FlyingCar2 obj = new FlyingCar2();
        obj.setSpeed(300);
        obj.fly();
    }
}
