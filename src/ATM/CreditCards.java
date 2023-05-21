package ATM;

public class CreditCards {
    private String cardNumber;
    private int balance;
    private int sum;

    public CreditCards(String cardNumber, int balance)
    {
    this.cardNumber = cardNumber;
    this.balance = balance;
    }
    public void getCreditCardsInfo()
    {
    System.out.println("Credit card number is: " + this.cardNumber);
    System.out.println("Credit card balance is: " + this.balance);
    }
    public void setCreditCards(){
        this.cardNumber = cardNumber;
        this.balance = balance;
    }

    void downloadMoney(int sum) {
        balance = balance - sum;
        System.out.println("Your new balance is: " + this.balance);

    }
    void addMoney(int sum) {
        balance = balance + sum;
        System.out.println("Your new balance is: " + this.balance);
    }
}
