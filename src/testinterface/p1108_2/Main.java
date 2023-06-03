package testinterface.p1108_2;

public class Main {
    public static void main(String[] args) {
        IAnimal p = new Person();
        Person person = (Person) p;

        person.work();
        person.eat();
        person.sleep();
        person.make();

        IAnimal d = new Dog();
        Dog dog = (Dog)d;
        dog.work();
        dog.eat();
        dog.sleep();
        dog.bark();

        IAnimal c = new Cat();
        Cat cat = (Cat) c;
    }
}
