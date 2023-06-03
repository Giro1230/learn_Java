package chap02;

public class ArithmeticOperations02 {
    private final double pi = 3.141592;
    private int radius;
    private int width;
    private int height;

    
    public void setArea(int radius){
        this.radius = radius;
    }
    double getArea(){
        return pi*radius*radius;
    }

    void setRectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }
    int getRectangle() {
        return width * height;
    }
}
