package dayFive;

public class BankAccount {
    private double balance;

    public BankAccount(double initialBalance){

        if(initialBalance < 0){
            System.out.println("Initial balance cannot be negative. Setting balance to zero");
        }
        balance = initialBalance;
    }
    public void deposit(double amount){
        if(amount > 0){
            balance += amount;
        }
    }
    public double getBalance(){
        System.out.println("Balance is " + balance);
        return balance;
    }

}
