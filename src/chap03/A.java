package chap03;

import java.util.Scanner;

class Contact{
    private String name;
    private String phonNumber;
    private Relationship[] r = new Relationship[5];

    Contact(String name, String phonNumber){
        this.name = name;
        this.phonNumber = phonNumber;
    }

    public void setFriend() {
        r[0] = new Relationship("friend");
    }
    public void setColleague() {
        r[1] = new Relationship("colleague");
    }
    public void setFamily() {
        r[2] = new Relationship("family");
    }
    public void setVIP() {
        r[3] = new Relationship("VIP");
    }
    public void setETC() {
        r[4] = new Relationship("ETC");
    }

    public String getPhonNumber() {
        return phonNumber;
    }

    public String getName() {
        return name;
    }

    public String getR(int num) {
        return r[num-1].getRelationShip();
    }
}

class Relationship{
    private String relationShip;
    
    Relationship(String relationShip){
        this.relationShip = relationShip;
    }

    public String getRelationShip() {
        return relationShip;
    }
}

class ContactTest{
    public static void main(String[] args) {
        Contact[] i = new Contact[10];
        Scanner sc = new Scanner(System.in);

        for (int j = 0; j < i.length; j++) {
            System.out.print("이름 : ");
            String name = sc.next();
            
            System.out.print("전화번호 : ");
            String phonNumber = sc.next();
            
            i[j] = new Contact(name, phonNumber);

            System.out.println("1. 친구\t2. 동료\t3. 가족\n4. VIP\t5. 기타");
            System.out.print("번호 입력 : ");
            int num = sc.nextInt();

            switch(num){
                case 1 : i[j].setFriend(); 
                    break;
                case 2 : i[j].setColleague();
                    break;
                case 3 : i[j].setFamily();
                    break;
                case 4 : i[j].setVIP();
                    break;
                case 5 : i[j].setETC();
                    break;
            }

            System.out.println(i[j].getName() + i[j].getPhonNumber() + i[j].getR(num));
        }
    }
}