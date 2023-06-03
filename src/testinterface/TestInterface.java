package testinterface;

class Shape{
    protected int x, y;

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }
}

interface Drawable{
    void draw();
}

class Circle extends Shape implements Drawable{
    int radius;

    @Override
    public void setX(int x) {
        super.setX(x);
    }

    @Override
    public void setY(int y) {
        super.setY(y);
    }

    @Override
    public void draw() {
        x = 1;
        y = 2;
        System.out.println("Circle Draw at ("+x+", "+y+")");
    }
}

public class TestInterface{
    public static void main(String[] args) {
        Drawable obj = new Circle();
        obj.draw();
    }
}
