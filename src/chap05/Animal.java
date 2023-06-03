package chap05;

class Animal {
    String name;

    void eat(){
        System.out.println("먹는다");
    }
}

class Cat extends Animal{
    public int speed;
    int Speed;

    void eat() {
        System.out.println("고양이 사료를 먹는다");
    }
}

class Dog extends Animal{
    Dog() {
        System.out.println("강아지 사료를 먹는다");
    }
}

class Tiger extends Animal{
    Tiger(){
        System.out.println("사냥해서 먹는다.");
    }

}

class TestAnimal{
    public static void main(String[] args) {
        Animal cat = new Cat();
        Animal dog = new Dog();
        Animal tiger = new Tiger();

        Animal[] animals = new Animal[3];
        animals[0] = cat;
        animals[1] = dog;
        animals[2] = tiger;

        for (int i = 0; i < animals.length; i++) {
        //  메서드 오버라이팅 : 매소드의 형태는 같은데 값이 다르다.
            animals[i].eat();
        }

        System.out.println(cat instanceof Cat);
        System.out.println(cat instanceof Animal);
    }
}
