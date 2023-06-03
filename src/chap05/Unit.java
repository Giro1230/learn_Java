package chap05;

class Unit {
    protected String name;
    protected int energy;
    Unit(String name, int energy) {
        this.name = name;
        this.energy = energy;
    }

    void attack(Unit unit){

    }
}

class MyUnit extends Unit {
    MyUnit(String name ,int energy){
        super(name, energy);
    }

    void attack(Unit unit) {
        if (unit instanceof Enemy) {
            unit.energy = (unit.energy - 10);
            System.out.println(unit.name + "을 공격하였습니다. Energy : " + unit.energy);
        }
    }
}

class Enemy extends Unit {
    Enemy(String name, int energy) {
        super(name, energy);
    }

    void attack(Unit unit) {
        if (unit instanceof MyUnit) {
            unit.energy = (unit.energy - 10);
            System.out.println(unit.name + "을 공격하였습니다. Energy : " + unit.energy);
        }
    }
}

class UnitTest{
    public static void main(String[] args) {
        MyUnit me = new MyUnit("me",100);
        MyUnit you = new MyUnit("you", 100);
        Enemy com = new Enemy("com", 100);

        me.attack(you);
        System.out.println(you.energy);
        me.attack(com);
        System.out.println(com.energy);
    }
}