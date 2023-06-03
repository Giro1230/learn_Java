package chap04;

public class Man {
    private String name;
    private int money;
    private Product present;

    Man(String name, int money){
        this.name = name;
        this.money = money;
    }

    void buyProduct(Product p){
        money -= p.getPrice();
        present = p;
    }

    private void takeProduct(Product p){
        present = p;
    }

    void giveProduct(Man who){
        who.takeProduct(present);
        present = null;
    }

    public String getName() {
        return name;
    }

    void showInfo(){
        System.out.println(name + "의 돈 : "+ money + " 선물 : " + present);
    }
}

class ManToMan{
    public static void main(String[] args) {
        Man m1 = new Man("철수",10000);
        Man m2 = new Man("영희",10000);
        Product p = new Product("반지", 5000);

        m1.showInfo();
        m1.buyProduct(p);
        m1.showInfo();
        m1.giveProduct(m2);
        m1.showInfo();
        m2.showInfo();

    }
}