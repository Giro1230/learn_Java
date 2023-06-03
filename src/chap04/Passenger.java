package chap04;

class Passenger {
    private String name;
    private int money;

    Passenger(String name, int money) {
        this.name = name;
        this.money = money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public String getName() {
        return name;
    }

    public int getMoney() {
        return money;
    }

    @Override
    public String toString() {
        return "Passenger{" +
                "name='" + name + '\'' +
                ", money=" + money +
                '}';
    }
}
class Bus{
    private String busName;
    private final int price = 1200;
    private int money;
    private int peopleCount = 0;


    Bus(String busName, int money){
        this.busName = busName;
        this.money = money;
    }

    void onBus(Passenger p){
        p.setMoney(p.getMoney() - price);
        setMoney(getMoney() + price);
        peopleCount++;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public int getMoney() {
        return money;
    }

    public int getPeopleCount() {
        return peopleCount;
    }

    @Override
    public String toString() {
        return "Bus{" +
                "busName='" + busName + '\'' +
                ", price=" + price +
                ", money=" + money +
                ", peopleCount=" + peopleCount +
                '}';
    }
}

class Test{
    public static void main(String[] args) {
        Passenger[] p = new Passenger[3];

        p[0] = new Passenger("Jonh", 10000);
        System.out.println(p[0].toString());
        System.out.println();

        Bus bus = new Bus("120", 10000);
        System.out.println(bus.toString());

        bus.onBus(p[0]);

        System.out.println();
        System.out.println(p[0].toString());

        System.out.println();
        System.out.println(bus.toString());
    }
}