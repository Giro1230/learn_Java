public class Main {
    public static void main(String[] args) {
        String st = "banna";
        st.toLowerCase();
        int cnt[] = new int[26];
        int index = 0;

        for (int i = 0; i < cnt.length; i++) {
            for (int j = 0; j < st.length(); j++) {
                if (st.charAt(j) == (i+97)) {
                    index++;
                }
            }
            cnt[i] = index;
            index = 0;
        }

        int max = 0;
        int best_st = 0;
        for (int i = 0; i < cnt.length; i++) {
            if (max < cnt[i]){
                max = cnt[i];
                best_st = i;
            }
        }

        System.out.println((char) best_st);
    }
}
