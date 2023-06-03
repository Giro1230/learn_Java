package p1118.Ex1;

import p1118.Ex1.HumanCamp1;
import p1118.Ex1.MachineCamp1;
import p1118.Ex1.Npc1;
import p1118.Ex1.Tank1;

public class Ex01_MyGame1 {
    public static void main(String[] args) {
        //게임 종족 생성
        HumanCamp1 human =new HumanCamp1();
        MachineCamp1 machine = new MachineCamp1();

        //게임 종족에 유닛을 담기
        human.set(new Npc1());
        machine.set(new Tank1());

        //게임 종족에서 유닛을 가져오기
        Npc1 hUnit = human.get();
        Tank1 mUnit = machine.get();

        System.out.println(hUnit);
        System.out.println(mUnit);

    }
}
