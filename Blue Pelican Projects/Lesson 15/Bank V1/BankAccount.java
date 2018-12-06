public class BankAccount
{
    public double balance;
    public String name;

    public BankAccount(double initBalance, String accName)
    {
        balance = initBalance;
        name = accName;
    }

    public void deposit(double deposit)
    {
        balance = balance + deposit;
    }

    public void withdraw(double withdraw)
    {
        balance = balance - withdraw;
    }
}