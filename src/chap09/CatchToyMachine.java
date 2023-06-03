package chap09;

import java.util.Random;

class CatchToyMachine {
    private Toy[] toys = new Toy[10];

    void catchToyMachine() {
        int j = 1;
        for (int i = 0; i < toys.length; i++) {
            int cNum = i % 3;
            switch (cNum) {
                case 0:
                    Doll doll = new Doll();
                    String name = "A" + (i+1);
                    doll.setName(name);

                    String size = (String)("10" + j++);
                    doll.setSize(size);

                    toys[i] = doll;

                    break;
                case 1:
                    KeyHold keyHold = new KeyHold();

                    name = "Key" + i+1;
                    keyHold.setName(name);

                    String material = "플라스틱";
                    keyHold.setMaterial(material);

                    toys[i] = keyHold;
                    break;
                case 2:
                    BubbleGum bubbleGum = new BubbleGum();
                    name = "Bubble" + i+3;
                    bubbleGum.setName(name);

                    String color = "Red";
                    bubbleGum.setColor(color);

                    toys[i] = bubbleGum;
                    break;
            }
        }
    }

    Toy catchToy() {
        Toy t;
        Random rd = new Random();
        int num = rd.nextInt(10);
        return t = toys[num];
    }
}
