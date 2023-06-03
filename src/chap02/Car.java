package chap02;

public class Car {
    private int carNumber;
    private String color;
    private int speed;
    private static int count;

    public Car(){
        count++;
    }
    public void setCarNumber(int carNumber) {
        this.carNumber = carNumber;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public void setSpeed(int speed) {
        this.speed = speed;
    }
    public void showInfo() {
        System.out.printf("Car Number : %d\nCar Color : %s\nCar Speed : %d\nCar Make Count : %d\n",carNumber,color,speed,count);
    }

    public void speedUp() {
        speed++;
    }

    public void changeColor() {
        color = "Blue";
    }

    public Car(int carNumber, String color, int speed){
        this.carNumber = carNumber;
        this.color = color;
        this.speed = speed;
        count++;
    }
}
