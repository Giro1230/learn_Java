package chap06;

import java.util.ArrayList;
import java.util.Scanner;

class Menu{
    private final String name;
    private final int price;
    private int menuVolume;

    Menu(String name, int price){
        this.name = name;
        this.price = price;
    }

    public void setMenuVolume(int menuVolume) {
        this.menuVolume = menuVolume;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public int getMenuVolume() {
        return menuVolume;
    }

    @Override
    public String toString() {
        return  name + " " + "("+ price+"원)";
    }
}

class VendingMachine {
    private int money;
    private int userChoiceNum;
    private ArrayList<Menu> menus = new ArrayList<>();

    VendingMachine(int money){
        this.money = money;
    }

    public void setMenu(String name, int price, int volume) {
        Menu menu = new Menu(name, price);
        menu.setMenuVolume(volume);
        menus.add(menu);
    }


    @Override
    public String toString() {
        return "메뉴 : " + menus;
    }

    public void setUserChoiceNum(String userChoice) {
        for (int i = 0; i < menus.size(); i++) {
            if(menus.get(i).getName() == userChoice || Integer.parseInt(userChoice) - 1 == i){
                this.userChoiceNum = i;
                break;
            }
        }
    }

    String inputMoney(String userMoney){
        String n = "";

        for (int i = 0; i < userMoney.length(); i++) {
            if(userMoney.charAt(i) >= '0' && userMoney.charAt(i) <= '9'){
                    money = money + Integer.parseInt(userMoney);
                    n = "거스름돈 : " + String.valueOf(Integer.parseInt(userMoney) - menus.get(userChoiceNum-1).getPrice());
            }else {
                n = "다시 입력하세요";
            }
        }

        return n;
    }


}

class Test{
    public static void main(String[] args) {
        VendingMachine vm = new VendingMachine(100000);
        vm.setMenu("콜라",1200, 20);
        vm.setMenu("물",800, 20);
        vm.setMenu("실론티",1000, 20);

        Scanner scanner = new Scanner(System.in);
        System.out.print("돈을 넣어주세요 >> ");
        String sel = scanner.nextLine();
        System.out.println(vm);

        System.out.print("메뉴를 선택해주세요 >> ");
        String choice = scanner.nextLine();
        vm.setUserChoiceNum(choice);

        System.out.println(vm.inputMoney(sel));

    }
}

