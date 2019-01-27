import java.io.*;
import java.util.*; //includes ArrayList
import java.text.*; //for NumberFormat
import java.util.ArrayList;

public class Tester
{
    public static void main(String args[])
    {
        NumberFormat formatter = NumberFormat.getNumberInstance( );
        formatter.setMinimumFractionDigits(2);
        formatter.setMaximumFractionDigits(2);
        String name;

        ArrayList<BankAccount> bankList = new ArrayList<BankAccount>();
        
        do
        {
            Scanner kbReader = new Scanner(System.in);
            System.out.print("Please enter the name to whom the account belongs.(\"Exit\" to abort): ");
            name = kbReader.nextLine( );
            if( !name.equalsIgnoreCase("EXIT") )
            {
                System.out.print("Please enter the amount of the deposit. ");
                double amount = kbReader.nextDouble();
                System.out.println(" "); //gives an eye-pleasing blank line
                BankAccount account = new BankAccount(name, amount);
                bankList.add(account);
            }
        }
        while(!name.equalsIgnoreCase("EXIT"));

        //Search aryList and print out the name and amount of the largest bank account
        BankAccount ba = bankList.get(0);

        double maxBalance = ba.balance;
        String maxName = ba.name;
        for(int j = 1; j < bankList.size( ); j++)
        {
            if (bankList.get(j).balance > maxBalance)
            {
                maxBalance = bankList.get(j).balance;
                maxName = bankList.get(j).name;
            }
        }
        System.out.println("The account with the largest balance belongs to " + maxName);
        System.out.println("The amount is $" + maxBalance + ".");  
    }
}