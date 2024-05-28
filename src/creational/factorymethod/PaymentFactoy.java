package creational.factorymethod;

public class PaymentFactoy {
    public static payment buildPayment (Typayment typayment){
        switch (typayment) {
            case GOOGLEPAY:
                return new GooglePayment();
            case CARD:
                return new CardPayment();
            default:
                return new CardPayment();
        }
    }
}
