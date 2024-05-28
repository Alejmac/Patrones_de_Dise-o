import creational.factorymethod.PaymentFactoy;
import creational.factorymethod.Typayment;
import creational.factorymethod.payment;

public class Main {
    public static void main(String[] args) {
        probarFactoryMethod();
    }


    public static void probarFactoryMethod(){
        payment Payment  = PaymentFactoy.buildPayment(Typayment.CARD);
        Payment.doPayment();
    }
}