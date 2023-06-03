package chap07;

class Subject {
    String subjectName;
    int subjectScore;
    String message;

    Subject(String subjectName, int subjectScore) {
        this.subjectName = subjectName;
        this.subjectScore = subjectScore;
    }

    public void setSubjectScore(int subjectScore) {
        this.subjectScore = subjectScore;
    }

    public String getMessage() {
        if (subjectScore == 100) {
            message = "대단합니다!";
        } else if (subjectScore < 100 && subjectScore > 90) {
            message = "아주 아주 잘했어요";
        } else if (subjectScore <= 90 && subjectScore > 80) {
            message = "아주 잘 했어요!";
        } else if (subjectScore <= 80 && subjectScore > 60) {
            message = "참 잘 했어요";
        } else if (subjectScore <= 60) {
            message = "무슨 일있었나요?";
        }

        return message;
    }
}
