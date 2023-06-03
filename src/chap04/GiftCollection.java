package chap04;

import java.util.ArrayList;

class Product{
    private int price;
    private String name;

    Product(String name, int price){
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "name: " + name + " Price: " + price;
    }
}

class PresentSet{
    private ArrayList<Product> pSet = new ArrayList<Product>();
    private int price;

    void setProduct(String name, int price){
        Product p = new Product(name, price);
        pSet.add(p);
    }

    int getPrice(){
        for (int i = 0; i < 3; i++) {
            price = pSet.get(i).getPrice();
        }
        return price;
    }
}

class PresentTest{
    public static void main(String[] args) {
        PresentSet p = new PresentSet();
        p.setProduct("반지",1000);
        p.setProduct("목걸이",3000);
        p.setProduct("귀걸이",2000);

        int price = p.getPrice();

        System.out.println("Price : " + price);
    }
}
