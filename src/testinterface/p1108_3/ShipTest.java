package testinterface.p1108_3;

public class ShipTest {
    public static void main(String[] args) {
        Man m1 = new Man("철수");
        Man m2 = new Man("만수");
        Woman w1 = new Woman("영희");
        Woman w2 = new Woman("소희");
        Woman w3 = new Woman("주희");
        Alien al1 = new Alien();

        Ship422 s = new Ship422();

        s.ridingPassenger(m1);
        s.ridingPassenger(m2);
        s.ridingPassenger(w1);
        s.ridingPassenger(w2);
        s.ridingPassenger(w3);

        int man = s.countingMan();
        int woman = s.countingWoman();

        System.out.println("Man : " + man +", Woman : " + woman);

        s.showInfo();
    }
}
