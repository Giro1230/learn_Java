package testinterface.p1108_3;

import java.util.ArrayList;

public class Ship422 implements IShippable{
    ArrayList<PersonAble> person = new ArrayList<PersonAble>();

    @Override
    public void ridingPassenger(PersonAble p) {
        person.add(p);
    }

    @Override
    public int countingMan() {
        int count = 0;
        for (int i = 0; i < person.size(); i++) {
            if (person.get(i) instanceof Man) {
                count++;
            }
        }
        return count;
    }

    @Override
    public int countingWoman() {
        int count = 0;
        for (int i = 0; i < person.size(); i++) {
            if (person.get(i) instanceof Woman) {
                count++;
            }
        }
        return count;
    }

    public void showInfo(){
        for (PersonAble personAble : person) {
            System.out.println(personAble.name);
        }
    }
}
