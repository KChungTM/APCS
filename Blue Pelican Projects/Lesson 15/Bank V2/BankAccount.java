public class BankAccount
{
    private double balance;
    private String name;

    public BankAccount(double initBalance, String accName)
    {
        balance = initBalance;
        name = accName;
    }

    public double getBalance()
    {
        return balance;
    }

    public String getName()
    {
        return name;
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