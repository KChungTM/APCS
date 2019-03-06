import java.util.Scanner;

public class Tester
{
    public static void main(String[] args)
    {
        Scanner kb = new Scanner(System.in);

        System.out.print("How many disk are on the first peg?: ");
        int disk = kb.nextInt();
        towerOfHanoi.doTheFrigginSteps(disk, 1, 2, 3);

        System.out.println("Moves Taken: " + towerOfHanoi.FRICKINWORKUCUCK());
    }
}