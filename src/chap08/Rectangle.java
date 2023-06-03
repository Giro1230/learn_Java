package chap08;

import java.util.Scanner;

class Rectangle {
    int width;
    int height;
    int Area;

    Rectangle(int width, int height){
        this.width = width;
        this.height = height;
    }

    int getArea() {
        return Area = width * height;
    }
}

class Square extends Rectangle{
    Square(int width, int height){
        super(width, height);
    }

    int getArea(){
        return Area = width * height;
    }
}

class Oblong extends Rectangle{
    Oblong(int width, int height){
        super(width, height);
    }

    int getArea(){
        return Area = width * height;
    }
}

class Trapezoid extends Rectangle{
    int lowerSide;
    int Area;

    Trapezoid(int upperSide, int lowerSide, int height){
        super(upperSide, height);
        this.lowerSide = lowerSide;
    }

    int getArea(){
        return Area = ((width + lowerSide) * height) / 2;
    }
}

class RectangleTest{
    public static void main(String[] args) {
        Rectangle[] r = new Rectangle[3];
        Scanner sc = new Scanner(System.in);


        for (int i = 0; i < 3; i++) {
            switch (i) {
                case 0:
                    System.out.println("정 사각형");
                    System.out.print("너비를 입력해주세요 >> ");
                    int width = sc.nextInt();

                    System.out.print("높이를 입력해주세요 >> ");
                    int height = sc.nextInt();

                    r[0] = new Square(width, height);
                    System.out.println();
                    System.out.println("넓이는 " + r[0].getArea());
                    System.out.println();

                    break;

                case 1:
                    System.out.println("직 사각형");
                    System.out.print("너비를 입력해주세요 >> ");
                    width = sc.nextInt();

                    System.out.print("높이를 입력해주세요 >> ");
                    height = sc.nextInt();

                    r[1] = new Oblong(width, height);
                    System.out.println();
                    System.out.println("넓이는 " + r[1].getArea());
                    System.out.println();

                    break;
                case 2:
                    System.out.println("사다리꼴");
                    System.out.print("윗변을 입력해주세요 >> ");
                    int upperSide = sc.nextInt();

                    System.out.print("아렛변을 입력해주세요 >> ");
                    int lowerSide = sc.nextInt();

                    System.out.print("높이를 입력해주세요 >> ");
                    int height2 = sc.nextInt();

                    r[2] = new Trapezoid(upperSide, lowerSide, height2);
                    System.out.println();
                    System.out.println("넓이는 " + r[2].getArea());

                    Trapezoid t = (Trapezoid) r[2];
                    System.out.println(r[2].width);
                    System.out.println(((Trapezoid) r[2]).lowerSide);
                    System.out.println(r[2].height);

                    break;
            }
        }

    }
}