package chap02;

public class ArithmeticOperations {
    private int num1;
    private int num2;
    private final double pi = 3.141592;

    public void setNum1(int num1) {
        this.num1 = num1;
    }
    public void setNum2(int num2) {
        this.num2 = num2;
    }
    

    public void plus() {
        int n =  this.num1 + this.num2;
        System.out.println("Plus : " + n);
    }
    public void minus() {
        int n =  this.num1 - this.num2;
        System.out.println("Minus : " + n);
    }
    public void multiplication() {
        int n =  this.num1 * this.num2;
        System.out.println("Multiplication : " + n);
    }
    public void division() {
        double n = num1 / num2;
        System.out.printf("Division : %.2f",n);
        System.out.println();
    }
    public void circle() {
        double n = this.num1 * this.num1 * pi;
        System.out.printf("Circle : %0.3f",n);
        System.out.println();
    }
    public void pythagoreanTheorem(){
        int n = (num1 * num1) + (num2 * num2);
        System.out.println("Pythagorean Theorem : " + n);
    }
}
