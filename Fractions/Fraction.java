public class Fraction
{
	private int numerator;
	private int denominator;

	public Fraction(int top, int bot)
	{
		numerator = top;
		denominator = bot;
	}

	public void numeratorSet(int newTop)
	{
		numerator = newTop;
	}
	
	public void denominatorSet(int newBot)
	{
		denominator = newBot;
	}
		
	public int numeratorGet()
	{
		return numerator;
	}

	public int denominatorGet()
	{
		return denominator;
	}

	public void printFrac1()
	{
		System.out.println(numerator + "/" + denominator);
	}
	
	public void printFrac2()
	{
		System.out.println(numerator + "\n----\n" + denominator);
	}
	
	public int[] topFactorSearch()
	{
		int[] topFactors = new int[(numerator/2)+1];

		//topArray
		for (int i = 1; i<=numerator/2; i++)
		{
			if (numerator%i == 0)
				topFactors[i] = i;
		}
		return topFactors;
	}	

	public int[] botFactorSearch()
	{
		int[] botFactors = new int[(denominator/2)+1];

		//botArray
		for (int i = 1; i<=denominator/2; i++)
		{
			if (denominator%i == 0)
				botFactors[i] = i;
		}

		return botFactors;
	}

	public boolean isReducible(int[] topFactors, int[] botFactors)
	{
		int firstIndex = 0;
		int secondIndex = 0;

		while (topFactors[firstIndex] != botFactors[secondIndex] && topFactors[firstIndex] != 0 && botFactors[secondIndex] != 0 && topFactors[firstIndex] != 1 && botFactors[secondIndex] != 1)
		{
			while (topFactors[firstIndex] > botFactors[secondIndex])
			{
				secondIndex++;
			}

			if (topFactors[firstIndex] == botFactors[secondIndex])
			{
				return true;
			}
			firstIndex++;
        }
        return false;
	}
	
	public void printer(int[] topFactors, int[] botFactors)
	{
		for (int i = 0; i<topFactors.length; i++)
		{
			System.out.print(topFactors[i]+",");
		}
		System.out.println(" ");
		for (int i = 0; i<botFactors.length; i++)
		{
			System.out.print(botFactors[i]+",");
		}
	}
}
