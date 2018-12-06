import java.io.*;
import java.util.*;
public class Lesson7Name
{
    public static void main(String[] args) 
    {
        Scanner names = new Scanner(System.in);

        System.out.print("Hello! What's your first name? \n");
        String name1 = names.next();
        System.out.print("What's your last name? \n");
        String name2 = names.next();
        System.out.print("Your full name is " + name1 + " " + name2);
    }
}