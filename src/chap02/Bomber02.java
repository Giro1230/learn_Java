package chap02;

import java.util.Random;

public class Bomber02 {
    private static int bombs;
    private char[][] map;

    public Bomber02(char[][] map){
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
        Bomber02.bombs = bombs;
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
                } else{
                    System.out.println("Ops~");
                }
                if(i == x && j == y && map[i][j] == 'P') {
                    if(x == 0 && y == 0){
                        map[x][y] = 'X';
                        map[x+1][y+1] = 'X';
                        map[x+1][y] = 'X';
                        map[x][y+1] = 'X';
                    }
                    if(x == 0 && y != 0){
                        map[x][y] = 'X';
                        map[x+1][y+1] = 'X';
                        map[x+1][y-1] = 'X';
                        map[x+1][y] = 'X';
                        map[x][y+1] = 'X';
                        map[x][y-1] = 'X';
                    }
                    if(x != 0 && y == 0){
                        map[x][y] = 'X';
                        map[x+1][y+1] = 'X';
                        map[x-1][y+1] = 'X';
                        map[x+1][y] = 'X';
                        map[x][y+1] = 'X';
                        map[x-1][y] = 'X';
                    }
                    if(x != 0 && y != 0 && x != num -1 && y != num - 1){
                        map[x][y] = 'X';
                        map[x][y+1] = 'X';
                        map[x][y-1] = 'X';
                        map[x-1][y] = 'X';
                        map[x-1][y+1] = 'X';
                        map[x-1][y-1] = 'X';
                        map[x+1][y+1] = 'X';
                        map[x+1][y-1] = 'X';
                        map[x+1][y] = 'X';
                    }
                    if(x == num - 1 && y == num - 1){
                        map[x][y] = 'X';
                        map[x][y-1] = 'X';
                        map[x-1][y] = 'X';
                        map[x-1][y-1] = 'X';  
                    }
                    if(x != num-1 && y == num-1){
                        map[x][y] = 'X';
                        map[x+1][y] = 'X';
                        map[x-1][y] = 'X';
                        map[x][y-1] = 'X';
                        map[x+1][y-1] = 'X';
                        map[x-1][y-1] = 'X';
                    }
                    if(x == num-1 && y != num-1){
                        map[x][y] = 'X';
                        map[x][y+1] = 'X';
                        map[x][y-1] = 'X';
                        map[x-1][y+1] = 'X';
                        map[x-1][y-1] = 'X';
                        map[x-1][y] = 'X';
                    }
                }
            }
        }

        return bombs--;
    }
}
