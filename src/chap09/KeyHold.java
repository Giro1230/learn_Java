package chap09;

class KeyHold extends Toy {
    private String material;

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getMaterial() {
        return material;
    }

    String ToString() {
        return "name : " + getName() + "\t" +
                "material : " + getMaterial();
    }
}
