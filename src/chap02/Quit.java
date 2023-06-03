package chap02;

public class Quit {
    private final String q1 = "banana";
    private final String q2 = "mango";
    private final String q3 = "apple";
    private final String q4 = "strawberry";
    private final String q5 = "grape";

    private int quitNumber;
    private String answer;

    void choiceQuit(int choiceNumber){
        this.quitNumber = choiceNumber;
    }

    void inputAnswer(String answer){
        this.answer = answer;
    }

    // String answerTrim(){
    //     String changeAnswer = answer.toLowerCase();
    //     for (int i = 0; i < answer.length(); i++) {
    //         char c = changeAnswer.charAt(i);
    //         if(c == ' '){
    //             String[] x = changeAnswer.split(" ");
    //             String y = x[i+1].concat(x[i]);
    //             changeAnswer = y;
    //         }
    //     }

    //     return changeAnswer;
    // }

    String getAnswer(){
        return answer;
    }

    void quit(){
        switch (quitNumber) {
            case 1:
                System.out.println("열대지방의 과일이며 종류가 얼마 없고 길이가 긴것은?");
                break;
            case 2:
                System.out.println("열대지방의 과일이며 종류가 얼마 없고 길이가 긴것은?");
                break;
            case 3:
                System.out.println("열대지방의 과일이며 종류가 얼마 없고 길이가 긴것은?");
                break;
            case 4:
                System.out.println("열대지방의 과일이며 종류가 얼마 없고 길이가 긴것은?");
                break;
            case 5:
                System.out.println("열대지방의 과일이며 종류가 얼마 없고 길이가 긴것은?");
                break;
        }
    }
    void quit2(){
        switch (quitNumber) {
            case 1:
                if(answer.toLowerCase().trim().equals(q1)){
                    System.out.println("정답입니다");
                }else{
                    System.out.println("오답입니다");
                }
                break;
            case 2:
                if(answer.toLowerCase().trim().equals(q2)){
                    System.out.println("정답입니다");
                }else{
                    System.out.println("오답입니다");
                }
                break;
            case 3:
                if(answer.toLowerCase().trim().equals(q3)){
                    System.out.println("정답입니다");
                }else{
                    System.out.println("오답입니다");
                }
                break;
            case 4:
                if(answer.toLowerCase().trim().equals(q4)){
                    System.out.println("정답입니다");
                }else{
                    System.out.println("오답입니다");
                }
                break;
            case 5:
                if(answer.toLowerCase().trim().equals(q5)){
                    System.out.println("정답입니다");
                }else{
                    System.out.println("오답입니다");
                }
                break;
        }
    }
}
