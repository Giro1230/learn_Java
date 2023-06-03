package chap05;

import java.util.Scanner;

class Customer2{
    protected static int customerId;
    protected String customerName;
    protected String customerGrade;
    protected int bonusPoint;
    protected double bonusRation;

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
        this.customerGrade = "SILVER";
    }

    public void setBonusPoint(int bonusPoint) {
        this.bonusPoint = bonusPoint;
    }

    int calcPrice(int price){
        bonusRation = 0.01;
        bonusPoint +=  (int)(price * bonusRation);

        return price;
    }

    String showCustomerInfo(){
        return "이름 : " + customerName + "\t" + "등급 : " + customerGrade + "\t" + "현제 적립 포인트 : " + bonusPoint;
    }
}

class VIPCustomer2 extends Customer2{
    private int agentID;
    private double saleRatio;

    VIPCustomer2(String name) {
        customerName = name;
        customerGrade = "VIP";
        agentID++;
    }

    int calcPrice(int price){
        bonusRation = 0.05;
        saleRatio = 0.1;
        bonusPoint +=  (int)(price * bonusRation);
        price -= (int)(price * saleRatio);

        return price;
    }

    public void setSaleRatio(double saleRatio) {
        this.saleRatio = saleRatio;
    }
}

class CustomerTest2{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("고객님의 이름을 입력해주세요 >> ");
        String name = sc.next();

        System.out.print("제품의 가격을 입력해주세요 >> ");
        int price = sc.nextInt();

        Customer2 c = new Customer2();
        c.setCustomerName(name);
        int totalPrice = c.calcPrice(price);
        System.out.println(c.showCustomerInfo() + "\t"+"제품 가격 : " + totalPrice);



        System.out.print("고객님의 이름을 입력해주세요 >> ");
        String name2 = sc.next();

        System.out.print("제품의 가격을 입력해주세요 >> ");
        int price2 = sc.nextInt();

        VIPCustomer2 v = new VIPCustomer2(name2);
        totalPrice = v.calcPrice(price2);
        System.out.println(v.showCustomerInfo() + "\t"+"제품 가격 : " + totalPrice);
    }

}