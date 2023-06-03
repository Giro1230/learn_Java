package chap02;

public class HumanTest {
    public static void main(String[] args) {
        Human h1 = new Human("Ming", "Chinese", 'M');
        h1.showInfo();
        int cnt = h1.getCount();
        System.out.println(cnt);
        System.out.println();
        
        Human h2 = new Human("Christina", "USA", 'W');
        h2.showInfo();
        cnt = h2.getCount();
        System.out.println(cnt);
        System.out.println();
        
        Human h3 = new Human("Max", "Germany", 'M');
        h3.showInfo();
        cnt = h3.getCount();
        System.out.println(cnt);
        System.out.println();

        Human h4 = new Human("Louis", "Italia", 'M');
        h4.showInfo();
        cnt = h4.getCount();
        System.out.println(cnt);
        System.out.println();
    }
}
