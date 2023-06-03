package chap02;

public class Student02Test {
    public static void main(String[] args) {
        Student02 st01 = new Student02("Hyun", 80, 78, 95);
        st01.getTotal();
        st01.showInfo();

        Student02 st02 = new Student02();
        st02.setName("Woo");
        st02.setKor_score(88);
        st02.setEng_score(97);
        st02.setMath_score(50);
        st02.getTotal();
        st02.showInfo();

        Student02[] arr = new Student02[2];
        
        arr[0] = st01;
        arr[1] = st02;

        int stuTotal = 0;

        for (int i = 0; i < arr.length; i++) {
            stuTotal += arr[i].getTotal02();
        }

        System.out.println("학생들의 총점 : "+stuTotal);
    }
}
