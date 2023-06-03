package testinterface;

interface Buy{
    void buy();
}

interface Sell{
    void sell();
}

class Customer implements Buy, Sell{

    @Override
    public void buy() {
        System.out.println("구매하기");
    }

    @Override
    public void sell() {
        System.out.println("판매하기");
    }
}

public class CustomerTest {
    public static void main(String[] args) {
        Customer customer = new Customer();
        customer.buy();
        customer.sell();

        Buy buyer = customer;
        buyer.buy();

        Sell seller = customer;
        seller.sell();
        
        if (seller instanceof Customer) {
            Customer customer2 = (Customer)seller;

            customer2.buy();
            customer2.sell();
        }
    }
}
