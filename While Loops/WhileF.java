import java.util.Scanner;

public class WhileF
{
	public static void main(String[] args)
	{
		Scanner kboard = new Scanner(System.in);
		System.out.println("Please enter a sentence: ");
		String sentence = kboard.nextLine();
		System.out.println("Please enter a letter: ");
		String letter = kboard.nextLine();
		int index = 0;
		int remove = sentence.indexOf(letter);
		int counter = 0;

		while (index <= sentence.length())
		{
			System.out.print(sentence.substring(index,remove));	// get the index of the letter im removing 		
			sentence = sentence.substring(remove + 1);		// sets new sentence
			remove = sentence.indexOf(letter);

			if (remove < 0) //stops java from setting the index to -1 when it can't find another letter
				break;
		}
		System.out.print(sentence); //prints last chunk
	}	
}

	
		

	
