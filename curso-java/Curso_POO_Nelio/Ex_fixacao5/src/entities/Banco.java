package entities;

public class Banco {

    private int numberAccount;
    private String holder;
    private double balance;

    public Banco(int numberAccount, String holder) {
        this.numberAccount = numberAccount;
        this.holder = holder;
    }

    public Banco(int numberAccount, String holder, double initialValue) {
        this.numberAccount = numberAccount;
        this.holder = holder;
        deposit(initialValue);
    }

    public int getNumberAccount() {
        return numberAccount;
    }

    public String getHolder() {
        return holder;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount){
        balance += amount;
    }

    public void withdraw(double amount){
        balance -= amount + 5;
    }

    public String toString(){
        return "Account "
                + numberAccount
                + ", Holder: "
                + holder
                + ", Balance: $ "
                + String.format("%.2f",balance);
    }

}

