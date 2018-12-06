import java.util.Scanner;

public class Tester
{
	public static void main(String[] args)
	{
		Scanner kboard = new Scanner (System.in);
		
		System.out.print("Please enter your numerator and denominator: ");
		
		Fraction frac = new Fraction(kboard.nextInt(), kboard.nextInt());
		frac.printFrac1();
		frac.printFrac2();	
	}
}
