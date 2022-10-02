public class CreditCardStrategy implements PaymentStrategy {

    private String name;
    private String cardNumber;
    private String cvv;
    private String date;

    public CreditCardStrategy(String name, String cardNum, String cvv, String date){
        this.name = name;
        this.cardNumber = cardNum;
        this.cvv = cvv;
        this.date = date;
    }
    @Override
    public void pay(int amount) {
        System.out.println(amount +" paid with credit card");
    }

}