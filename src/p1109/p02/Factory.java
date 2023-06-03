package p1109.p02;

public class Factory {
    public Object getBrand(String brandName) {
        if(brandName.trim().equalsIgnoreCase("lg")){
            return new LG();
        } else if(brandName.trim().equalsIgnoreCase("samsung")){
            return new Samsung();
        } else if (brandName.trim().equalsIgnoreCase("deawoo")){
            return new DeaWoo();
        } else if (brandName.trim().equalsIgnoreCase("apple")){
            return new Apple();
        }
        return null;
    }

    public Object getSpeakerBrand(String brandName){
        if (brandName.trim().equalsIgnoreCase("sony")) {
            return new SonySpeaker();
        } else if (brandName.trim().equalsIgnoreCase("apple")){
            return new AppleSpeaker();
        }
        return null;
    }
}
