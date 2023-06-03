package chap02;

import java.util.Random;

public class Bomber {
    private static int bombs;
    private char[][] map;

    public Bomber(char[][] map){
        this.map = map;
    }

    void makeMap(int num){
        for (int i = 0; i < num; i++) {
            for (int j = 0; j < num; j++) {
                map[i][j] = 'P';
            }
        }
    }

    public void bombersLoad(int bombs) {
        Bomber.bombs = bombs;
    }

    void makeTarget(int num){
        Random rd = new Random();

        int targetX = rd.nextInt(num);
        int targetY = rd.nextInt(num);

        for (int i = 0; i < num; i++) {
            for (int j = 0; j < num; j++) {
                if(i == targetX && j == targetY){
                    map[i][j] = 'O';
                }
            }
        }
    }

    void mapOutput(){
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map.length; j++) {
                System.out.print("\t"+map[i][j]);
            }
            System.out.println();
        }
    }
    
    int dropBomb(int num, int x, int y){
        for (int i = 0; i < num; i++) {
            for (int j = 0; j < num; j++) {
                if (i == x && j == y && map[i][j] == 'O') {
                    System.out.println("Good Short");
                    bombs = 0;
                } 
                if(i == x && j == y && map[i][j] == 'P') {
                    System.out.println("Ops~");
                    map[x][y] = 'X';
                }
            }
        }

        return bombs--;
    }
}
