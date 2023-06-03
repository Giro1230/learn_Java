package p1109.p01;

public class BeanFactory {

    public Object getBean(String beanName){
        Object brand = null;
        if (beanName.trim().equalsIgnoreCase("samsung")) {
            brand = new SamsungTV();
        }else if (beanName.trim().equalsIgnoreCase("lg")){
            brand = new LgTV();
        }
        return brand;
    }
}
