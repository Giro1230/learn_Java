package chap02;

public class Student02 {
    private String name;
    private int kor_score;
    private int eng_score;
    private int math_score;
    private int total;

    public Student02(){}
    public Student02(String name, int kor_score, int eng_score, int math_score){
        this.name = name;
        this.kor_score = kor_score;
        this.eng_score = eng_score;
        this.math_score = math_score;
    }

    public void getTotal() {
        total = kor_score + eng_score + math_score;
    }

    public int getTotal02() {
        return total;
    }

    public void showInfo(){
        System.out.printf("%s 학생의 총점은 %d점 입니다.\n",name, total);
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setKor_score(int kor_score) {
        this.kor_score = kor_score;
    }
    public void setEng_score(int eng_score) {
        this.eng_score = eng_score;
    }
    public void setMath_score(int math_score) {
        this.math_score = math_score;
    }

    
}
