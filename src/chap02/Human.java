package chap02;

public class Human {
    private String name;
    private String nationality;
    private char gender;
    private static int count;

    public Human(){}

    public Human(String name , String nationality, char gender){
        this.name = name;
        this.nationality = nationality;
        this.gender = gender;
        count++;
    }

    void showInfo(){
        System.out.printf("Name : %s\nNationality : %s\nGender : %c\n",name, nationality, gender);
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public int getCount() {
        return count;
    }
}
