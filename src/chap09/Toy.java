package chap09;

class Toy {
    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    String ToString(){
        return "name : " + getName();
    }
}
