public class Till {
    private double money;

    public Till(double money){
        this.money = money;
    }

    public double getMoney() {
        return this.money;
    }

    public void increaseMoney(double amount){
        this.money += amount;
    }

    public void decreaseMoney(double amount){
        this.money -= amount;
    }
}
