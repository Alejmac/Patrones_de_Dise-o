package creational.factorymethod;

public class CardPayment implements payment{
    @Override
    public void doPayment() {
        System.out.println("pagando con tarjeta de credito");
    }
}
