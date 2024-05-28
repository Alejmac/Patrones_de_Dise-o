package creational.factorymethod;

public class GooglePayment implements payment{
    @Override
    public void doPayment() {
        System.out.println("Pagando con Google payment");
    }
}
