package chap08;

class Car {
    String model;
    String color;

    Car(){
        this.model = "렉서스";
        this.color = "흰색";
        System.out.println("Car 클래스의 매개변수 없는 기본 생성자");
    }

    Car(String model, String color){
        this.model = model;
        this.color = color;
        System.out.println("Car 클래스의 매개변수 있는 생성자");
    }

    @Override
    public String toString() {
        return  "model='" + model + '\'' +
                ", color='" + color + '\'';
    }
}

class Texi extends Car{
    boolean taxiMeter;
    int taxiFare = 2000;

    Texi(){
        super();
    }

    Texi(String model, String color){
        super(model, color);
    }

    Texi(String model, String color, boolean taxiMeter, int taxiFare){
        super(model, color);
        this.taxiMeter = taxiMeter;
        this.taxiFare = taxiFare;
    }

    void power(){
        taxiMeter =! taxiMeter;
    }
}