package chap09;

class BubbleGum extends Toy {
    private String color;

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    String ToString() {
        return "name : " + getName() + "\t" +
                "color : " + getColor();
    }
}
