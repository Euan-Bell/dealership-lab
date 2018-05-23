public class Customer {
    private double wallet;

    public Customer(double wallet){
        this.wallet = wallet;
    }

    public double getWallet() {
        return this.wallet;
    }

    public void increaseWallet(double amount){
        this.wallet += amount;
    }

    public void decreaseWallet(double amount){
        this.wallet -= amount;
    }
}
