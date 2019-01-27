import java.util.ArrayList;
import java.util.Scanner;

public class ArrayGlitch
{
    public static void main(String[] args)
    {
        Scanner kboard = new Scanner(System.in);
        ArrayList<Integer> intList = new ArrayList<Integer>();
        ArrayList<Integer> newList = new ArrayList<Integer>();

        /*
            Problem:
            Removes number from index and moves index up one
        */

        intList.add(3);
        intList.add(2);
        intList.add(8);
        intList.add(5);
        intList.add(9);
        intList.add(0);
        intList.add(7);
        intList.add(1);
        intList.add(6);
        intList.add(4);

        System.out.println(intList);

        System.out.print("Which method would you like to see?\nPlease enter either 1/2: ");
        String input = kboard.nextLine();

        if (input.contains("1"))
        {
            //  Method 1:
            //  Use removeIf() method
            //  removeIf(*variable name for index* -> *parameters to remove*)

            intList.removeIf(index -> (index % 2 != 0));

            System.out.println(intList);
        }
        else if (input.contains("2"))
        {
            //  Method 2:
            //  Append largest int values
            //  to end of list

            int counter = 0;
            for(int i = 0; i<intList.size(); i++)
            {
                while(intList.get(i)%2!=0)
                {
                    intList.add(-2147483648);
                    intList.remove(i);
                    counter++;
                }
            }

            System.out.print("[");
            for(int i = 0; i<intList.size()-counter;i++)
            {
                if (i==intList.size()-counter-1)
                    System.out.print(intList.get(i) + "]");
                else
                    System.out.print(intList.get(i) + ",");
            }
        }
        else
        {
            System.out.println("Hey! That's illegal");
            System.exit(0);
        }
    }
}