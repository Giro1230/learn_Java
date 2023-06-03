package testinterface;

class Cat implements SoundAble{
    @Override
    public String sound() {
        return "야옹~ 야옹~";
    }
}

class Dog implements SoundAble {
    @Override
    public String sound() {
        return "멍! 멍!";
    }
}

interface SoundAble{
    String sound();
}

public class TestInterface2 {
    private static void printSound(SoundAble animal){
        System.out.println(animal.sound());
    }

    public static void main(String[] args) {
        printSound(new Cat());
        printSound(new Dog());
    }
}
