package chap07;

import java.util.ArrayList;

class Teacher extends Human {
    String clasName;

    Teacher(String name, String clasName) {
        super(name);
        this.clasName = clasName;
    }

    public void setPwdTeacher(String pwd) {
        super.setPwd(pwd);
    }

}
