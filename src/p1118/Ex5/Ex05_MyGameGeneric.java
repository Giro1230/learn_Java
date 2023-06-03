package p1118.Ex5;

import p1118.Ex1.Npc1;
import p1118.Ex1.Tank1;

public class Ex05_MyGameGeneric {
    public static void main(String[] args) {
        Camp5<Npc1> human = new Camp5<>();
        Camp5<Tank1> machice = new Camp5<>();
        Camp5<Student> std = new Camp5<>();

        human.set(new Npc1());
        machice.set(new Tank1());
        std.set(new Student());

        Npc1 nUnit = human.get();
        Tank1 mUnit = machice.get();
        Student student = std.get();

        System.out.println(nUnit.toString());
        System.out.println(mUnit.toString());
        System.out.println(student.toString());
    }
}
