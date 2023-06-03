package chap02;

public class MyList {
    String[] sArr = new String[5];
    int cnt;
    
    void add(String name){
        if (cnt >= sArr.length) {
            String[] temp = new String[sArr.length + 5];

            for (int i = 0; i < sArr.length; i++) {
                temp[i] = sArr[i];
            }
            sArr = temp;
        }
        
        sArr[cnt] = name;
        cnt++;
    }

    String get(int num){
        return sArr[num-1];
    }
}
