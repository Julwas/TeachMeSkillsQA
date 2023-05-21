package ATM;

public class CreditCards {
    private String cardNumber;
    private int balans;
    private int sum;

    public CreditCards(String cardNumber, int balans)
    {
    this.cardNumber = cardNumber;
    this.balans = balans;
    }
    public void getCreditCardsInfo()
    {
    System.out.println("Credit card number is: " + this.cardNumber);
    System.out.println("Credit card balance is: " + this.balans);
    }
    public void setCreditCards(){
        this.cardNumber = cardNumber;
        this.balans = balans;
    }

    void downloadMoney(int sum) {
        balans = balans - sum;
        System.out.println("Your new balance is: " + this.balans);

    }
    void addMoney(int sum) {
        balans = balans + sum;
        System.out.println("Your new balance is: " + this.balans);
    }
}
