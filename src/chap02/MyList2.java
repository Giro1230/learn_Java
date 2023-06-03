package chap02;

public class MyList2 {
    String[] sArr = new String[5];
    int methodCnt = sArr.length;
    int cnt;
    String[] temp = new String[sArr.length + 5];

    void add(String name){
        if (cnt >= sArr.length) {
            temp[cnt] = name;
            cnt++;
        }else{
            sArr[cnt] = name;
            cnt++;
        }
    }

    void sArrChange(){
        for (int i = 0; i < sArr.length; i++) {
            temp[i] = sArr[i];
        }
        sArr = temp;
    }

    String get(int num){
        if (num - 1 >= sArr.length) {
            return temp[num-1];
        }else{
            return sArr[num-1];
        }
    }
}
