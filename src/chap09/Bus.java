package chap09;

abstract class Transportation{
    abstract void go();
}

class Bus extends Transportation{

    @Override
    void go() {
        System.out.println("부산행 버스에 몸을 싣고");
    }
}

class Train extends Transportation{

    @Override
    void go() {
        System.out.println("부산행 기차에 몸을 싣고");
    }
}

class BusanTravel{
//    void goBusan(Bus b){
//        b.goBus();
//    }
//    void goBusan(Train t){
//        t.goTrain();
//    }
}

class BusanTravel2{
    void goBusan(Transportation x){
        x.go();
    }
}

class BusanTravelTest{
    public static void main(String[] args) {
        BusanTravel2 b = new BusanTravel2();
        Bus d = new Bus();
        Train i = new Train();
        b.goBusan(d);
        b.goBusan(i);
    }
}
