package p1115;

import java.util.Vector;

class Point{
    private int x,y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return  "(" + x +", " + y +")";
    }

    // 기본생성자 X
    // 오버로딩 생성자..x,y값을 매개변수로 받아 생성
    // toString 메소드 오버라이딩..(x,y)
}

public class PointVectorEx {
    public static void main(String[] args) {
        // Point 타입의 백터 생성
        Vector<Point> pv = new Vector<Point>();
        // 3개의 Point 객체를 삽입 (2,3) (-5, 20) (30, -8)
        Point p1 = new Point(2,3);
        Point p2 = new Point(-5,20);
        Point p3 = new Point(30,-8);

        pv.add(p1);
        pv.add(p2);
        pv.add(p3);


        // 인텍스 1의 Point 객체를 삭제
        pv.remove(1);

        // 백터에 있는 Point 객체 모두 출력, 반복문 사용
        for (Point point : pv) {
            System.out.println(point.toString());
        }
    }
}
