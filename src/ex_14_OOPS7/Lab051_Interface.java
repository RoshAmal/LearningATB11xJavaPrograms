package ex_14_OOPS7;

public class Lab051_Interface {
    public static void main(String[] args){
        BankAccount account;
        account = new SavingsAccount(12000);

        System.out.println(account.getBalance());
        account.deposit(10000);
        System.out.println(account.getBalance());
        account.deposit(1000);
        System.out.println(account.getBalance());
        account.withdraw(5000);
        System.out.println(account.getBalance());

        account = new CurrentAccount(10000, 5000);
        System.out.println(account.getBalance());
        account.withdraw(5000);
        System.out.println(account.getBalance());
        account.withdraw(5000);
        System.out.println(account.getBalance());
        account.withdraw(5000);
        System.out.println(account.getBalance());
        account.deposit(15000);
        System.out.println(account.getBalance());
    }
    
}
interface BankAccount{
    public void deposit(double amount);
    public void withdraw(double amount);
    public double getBalance();
}
class SavingsAccount implements BankAccount{
    private double balance;
    public SavingsAccount(double balance){
        if (balance > 0)
            this.balance = balance;
        else return;

    }
    public void deposit(double amount){
        if (balance > 0)
            balance += amount;
        else return;
    }
    public void withdraw(double amount){
        if (balance - amount > 0){
            if (balance > 0)
                balance -= amount;
            else return;
        }
        else return;
    }
    public double getBalance(){
        return balance;
    }
}
class CurrentAccount implements BankAccount {
    private double balance;
    private double overdraftLimit;
    public CurrentAccount(double balance, double overdraftLimit) {
        if (balance > 0){
            this.balance = balance;
            this.overdraftLimit = overdraftLimit;
        }
        else return;
    }
    public void deposit(double amount){
        if (amount > 0)
            balance += amount;
        else return;
    }
    public void withdraw(double amount){
        if (balance + overdraftLimit > amount)
            balance -= amount;
        else return;
    }
    public double getBalance(){
        return balance;
    }
}