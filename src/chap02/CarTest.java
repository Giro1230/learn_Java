package chap02;

public class CarTest {
    public static void main(String[] args) {
        Car[] cars = new Car[10];

        for (int i = 0; i < cars.length; i++) {
            if(i % 2 == 0){
                cars[i] = new Car(i+1, "Red", 190);
                cars[i].setSpeed(190+i);
            } else{
                cars[i] = new Car(i+1, "Blue", 190);
                cars[i].setSpeed(190+i);
            }
            System.out.println();
            cars[i].showInfo();
        }
    }
}
