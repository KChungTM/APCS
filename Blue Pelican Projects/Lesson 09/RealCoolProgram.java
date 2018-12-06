/*
    This Java file contains both assignments, Practice 1 and 2.
    It will default to Practice 1, the modified EvenOrOdd program.
    To get to Practice 2, the scrolling "your name is cool", just type "practice2" into the integer field.
    To exit out of the program, type "end" into the integer field (in Practice 1).
    Practice 2 will take approximately 2.5 minutes to complete; watching it for the entire time is not recommended.
*/

import java.util.Scanner;

public class RealCoolProgram 
{   //this isn't cool
    public static void main(String[] args)
    {
        System.out.println("Practice 1");
        System.out.println("__________\n");
        practice1();
    }

    public static void practice1() {
        
        Scanner kboard = new Scanner(System.in);
        
        //Runs in a loop so the program won't end after every number
        while (true)
        {

            System.out.print("Enter an integer: "); //Ask user
            
            //Deal with unwanted inputs
            if (!kboard.hasNextInt())
            {

                //If user did not input a number, check if they input a command
                String str = kboard.nextLine();

                //If user inputs "END"
                if (str.equalsIgnoreCase("practice2"))
                {
                    practice2();
                } 
                else if (str.equalsIgnoreCase("end"))
                {

                    System.out.println("System shutting down...");
                    System.exit(0); //shutdown

                } 
                else 
                {    //Otherwise, user input is invalid, so start from the top again
                    System.out.println("Invalid input. Please try again.\n");
                    practice1();
                }
            }
            
            //If user did input a number, then execute this
            else
            {

                int num = kboard.nextInt(); 
                
                //Math and result
                if (num % 2 == 0) System.out.println("The integer " + num + " is even.\n");
                else System.out.println("The integer " + num + " is odd.\n");

            }
        }
    }

    public static void practice2()
    {
       
        System.out.println("\n\nPractice 2");
        System.out.println("__________\n");

        int i = 0;

        while (i < 30000)
        {
            System.out.print("\"your name is cool! \"      ");
            i++;

            try {
                Thread.sleep(5);    //This takes 2.5 minutes to run
            } catch (InterruptedException e) {return;}
        }
    }
}