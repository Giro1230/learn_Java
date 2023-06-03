package p1118.Ex2;

import p1118.Ex1.Npc1;
import p1118.Ex1.Tank1;

public class Ex02_MyGame2 {
    public static void main(String[] args) {
        Camp2 human = new Camp2();
        Camp2 machice = new Camp2();

        human.set(new Npc1());
        machice.set(new Tank1());

        Npc1 hUnit = (Npc1) human.get();
        Tank1 mUnit = (Tank1) machice.get();

        System.out.println(hUnit);
        System.out.println(mUnit);
    }
}
