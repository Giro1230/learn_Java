package chap08;

class Animal {
    int n = 10;

    void cry(){
        System.out.println("....");
    }

}

class Human extends Animal{
    int n = 20;

    void cry() {
        System.out.println("엉엉");
    }
}

class Dog extends Animal{
    int n = 30;

    void cry() {
        System.out.println("멍멍");
    }
}

class AnimalTest{
    public static void main(String[] args) {
//        Animal a = new Animal();
//        System.out.println(a.n);
//
//        Human h = new Human();
//        System.out.println(h.n);


//      부모타입에 자식객체를 만들게 되면 맴버변수는 부모의 것을 따르게 되고
//      매소드의 경우는 자식의 매소드를 나타내게 된다.
//        Animal x = new Human();
//        System.out.println(x.n);
//        x.cry();

//      Human y = new Animal();
//      System.out.println(y.n);
//      y.cry();

        Animal[] a2 = new Animal[2];
        a2[0] = new Human();
        a2[1] = new Dog();

        System.out.println(a2[0].n);
        System.out.println(a2[1].n);

        Human j = (Human)a2[0];
        System.out.println(j.n);

        Dog i = (Dog)a2[1];
        System.out.println(i.n);
    }
}
