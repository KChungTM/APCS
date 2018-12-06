import java.util.Scanner;

public class Tester
{
    public static void main(String[] args)
    {
        Scanner kboard = new Scanner(System.in);

        System.out.println("What is your name?");
        String accName = kboard.nextLine();
        System.out.println("How much do you have in your account");
        double userBalance = kboard.nextDouble();
        kboard.nextLine();

        BankAccount myAccount = new BankAccount(userBalance, accName);

        System.out.println("How much do would you like to deposit?: ");
        myAccount.deposit(kboard.nextDouble());
        kboard.nextLine();
        System.out.println("The " + myAccount.getName() + " account balance is, $" + myAccount.getBalance());

        System.out.println("How much do would you like to withdraw?: ");
        myAccount.withdraw(kboard.nextDouble());
        kboard.nextLine();   
        System.out.println("The " + myAccount.getName() + " account balance is, $" + myAccount.getBalance());

        kboard.close();
    }
}