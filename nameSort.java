import java.io.*;
import java.util.Scanner;
import java.util.ArrayList;

public class nameSort 
{
	public static void main(String[] args) throws IOException
	{
		File file = new File("names&age");
		Scanner kb = new Scanner(file);
		ArrayList<String> sortedList = new ArrayList<String> ();
		
		FileWriter fw = new FileWriter("sortedList", false);
		PrintWriter output = new PrintWriter(fw);
		String nextLine = "";
		int sortedSize = sortedList.size();

		while(kb.hasNextLine())
		{
			if (sortedList.size() == 0)
				sortedList.add(kb.nextLine());
			else
			{
				nextLine = kb.nextLine();
				sortedSize = sortedList.size();
				for(int i = 0; i<sortedSize; i++)
				{
					if (i > sortedList.size())
						sortedList.add(nextLine);
					else if (nextLine.compareTo(sortedList.get(i)) > 0)
						sortedList.add(i, nextLine); 
				}
			}
		}
		
		System.out.println(sortedList);
	}
}
