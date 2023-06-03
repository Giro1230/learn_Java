package chap02;

public class MyList3 {
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

    int size(){
        for(int i = 0; i < sArr.length; i++){
            cnt = i;
            if(sArr[i] == null){
                break;
            }
        }
        return cnt;
    }

    void remove(int num){
        sArr[num -1] = null;
        for (int i = 0; i < sArr.length; i++) {
            if(sArr[i] == null){
                for(int j = i; j < sArr.length-1; j++){
                    sArr[j] = sArr[j+1];
                }
            }
        }
    }

    String get(int num){
        return sArr[num-1];
    }
}
