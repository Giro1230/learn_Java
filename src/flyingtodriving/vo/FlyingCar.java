package flyingtodriving.vo;

import flyingtodriving.service.IDrivable;
import flyingtodriving.service.IFlyable;

public class FlyingCar implements IFlyable, IDrivable {

    @Override
    public void dive() {
        System.out.println("I'm driving");
    }

    @Override
    public void fly() {
        System.out.println("I'm flying");
    }

    public static void main(String[] args) {
        FlyingCar obj = new FlyingCar();

        obj.dive();
        obj.fly();
    }
}
