package chap09;

class Doll extends Toy {
    private String size;

    public void setSize(String size) {
        this.size = size;
    }

    public String getSize() {
        return size;
    }

    String ToString() {
        return "name : " + getName() + "\t" +
                "size : " + getSize();
    }
}
