package chap05;

import java.util.Random;

class Ball {
    void showInfo(){
        System.out.println("무색 볼 입니다.");
    }
}

class RedBall extends Ball{
    void showInfo(){
        System.out.println("빨강색 볼 입니다.");
    }
}

class BlueBall extends Ball{
    void showInfo(){
        System.out.println("파랑색 볼 입니다.");
    }
}

class GreenBall extends Ball{
    void showInfo(){
        System.out.println("녹색 볼 입니다. ");
    }
}

class BallTest{
    public static void main(String[] args) {
        Ball[] balls = new Ball[10];
        Random random = new Random();
        int redCount = 0, blueCount = 0, greenCount = 0;

        for (int i = 0; i < balls.length; i++) {
            int num = random.nextInt(3)+1;

            switch (num) {
                case 1 : balls[i] = new RedBall();
                    if (balls[i] instanceof RedBall) {
                        redCount++;
                    }
                    break;
                case 2 : balls[i] = new BlueBall();
                    if (balls[i] instanceof BlueBall) {
                        blueCount++;
                    }
                    break;
                case 3 : balls[i] = new GreenBall();
                    if (balls[i] instanceof GreenBall){
                        greenCount++;
                    }
                    break;
            }

            balls[i].showInfo();
        }
        System.out.printf("빨강 공 : %d\t파란 공 : %d\t녹색 공 : %d", redCount, blueCount, greenCount);
    }
}
