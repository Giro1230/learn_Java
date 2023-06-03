package chap05;

import java.util.Scanner;

class Customer{
    private static int customerId;
    protected String customerName;
    private String customerGrade;
    protected int bonusPoint;
    protected double bonusRation;

    Customer(String customerName){
        this.customerName = customerName;
        this.customerGrade = "SILVER";

        customerId++;
    }

    public void setCustomerGrade(String customerGrade) {
        this.customerGrade = customerGrade;
    }

    public void setBonusPoint(int bonusPoint) {
        this.bonusPoint = bonusPoint;
    }

    int calcPrice(int price){
        if (customerGrade == "SILVER") {
            bonusRation = 0.01;
            bonusPoint +=  (int)(price * bonusRation);
            price = price;
        }
        if(customerGrade == "VIP"){
            bonusRation = 0.05;
            bonusPoint +=  (int)(price * bonusRation);
            price = price - (int)(price * 0.01);
        }
        return price;
    }

    String showCustomerInfo(){
        return "이름 : " + customerName + "\t" + "등급 : " + customerGrade + "\t" + "현제 적립 포인트 : " + bonusPoint;
    }
}

class VIPCustomer extends Customer{
    private int agentID;
    private double saleRatio;

    VIPCustomer(String customerName) {
        super(customerName);
        super.setCustomerGrade("VIP");
        super.setBonusPoint(100000);

        agentID++;
    }

    public void setSaleRatio(double saleRatio) {
        this.saleRatio = saleRatio;
    }
}

class CustomerTest{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("고객님의 이름을 입력해주세요 >> ");
        String name = sc.next();

        System.out.print("제품의 가격을 입력해주세요 >> ");
        int price = sc.nextInt();

        Customer c = new Customer(name);
        c.calcPrice(price);
        System.out.println(c.showCustomerInfo());



        System.out.print("고객님의 이름을 입력해주세요 >> ");
        String name2 = sc.next();

        System.out.print("제품의 가격을 입력해주세요 >> ");
        int price2 = sc.nextInt();

        VIPCustomer v = new VIPCustomer(name2);
        v.calcPrice(price2);
        System.out.println(v.showCustomerInfo());
    }

}

