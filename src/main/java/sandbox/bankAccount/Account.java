package sandbox.bankAccount;

public class Account {
    private int failCounter;
    private int balance;
    public void incFailedTransferCount(){
        failCounter++;
    }

    public int getFailCounter() {
        return failCounter;
    }

    public Account(int balance) {
        this.balance = balance;
    }
    public void withDraw(int amount){
        balance -= amount;
    }
    public void deposit(int amount){
        balance += amount;
    }

    public int getBalance() {
        return balance;
    }
}
