import java.util.Scanner;

import com.sun.scenario.effect.Merge;

public class AllSorts
{
	public static void main(String[] args)
	{
		Scanner kb = new Scanner(System.in);		
		int[] theArray = {4,2,5,1,3,18,0,9,6};
		String[] sort = new String[2];

		while(true)
		{
			System.out.println("Please pick the sort you would like.");
			System.out.println("1. Bubble Sort");
			System.out.println("2. Selection Sort");			
			System.out.println("3. Insertion Sort");
			System.out.println("4. Quick Sort");
			System.out.println("5. Merge Sort");
			System.out.println("================\t");
			
			String input = kb.nextLine().toLowerCase();
			System.out.println("");
			sort = input.split(" ");

			switch (input)
			{
				case("1"):
				case("bubble"):
				{
					Bubble(theArray);
					break;
				}
				case("2"):
				case("selection"):
				{
					Selection(theArray);
					break;
				}
				case("3"):
				case("insertion"):
				{
					Insertion(theArray);
					break;
				}
				case("4"):
				case("quick"):
				{
					Quick(theArray,0,theArray.length-1);
					break;
				}
				case("5"):
				case("merge"):
				{
					Merge(theArray, 0,theArray.length-1);
					break;
				}
			}
			
			for (int value: theArray)
				System.out.print(value + " ");

			System.out.println("");

			System.out.print("Would you like to see another sort?\n(Y)/(N): ");
			if (kb.nextLine().toLowerCase().contains("n"))
				System.exit(0);

			System.out.println("");
		}
	}

	public static void Bubble(int[] a)
	{
		boolean loopSomeMore;
		do
		{
			loopSomeMore = false;
			for(int j = 0; j <a.length-1; j++)
			{
				if(a[j] > a[j+1])
				{
					//swap a[j] and a[j+1]
					int temp = a[j];
					a[j] = a[j+1];
					a[j+1] = temp;

					loopSomeMore = true;
				}
			}
		}
		while(loopSomeMore);
	}

	public static void Selection(int[] a)
	{
		int min, minIndex;
		
		for(int i = 0; i<a.length; ++i)
		{
			min = a[i];
			minIndex = i;
			
			for(int j = i+1; j<a.length; ++j) //Find minimum
			{
				if (a[j] < min) //salient feature
				{
					min = a[j];
					minIndex = j;
				}
			}
			a[minIndex] = a[i]; //swap
			a[i] = min;
		}
	}

	public static void Insertion(int[] a)
	{
		int itemToInsert, j;
		boolean keepGoing;
		//On kth pass, insert k into correct position among the first k items in the array
		
		for(int k = 1; k<a.length;k++)
		{
			//Go backwards through list, looking for the slot to insert a[k]
			itemToInsert = a[k];
			j = k-1;
			keepGoing = true;
			
			while((j>=0) && keepGoing)
			{
				if (itemToInsert<a[j])
				{
					a[j+1] = a[j]; //Salient feature
					j--;
					if(j == -1) //special case for inserting at [0]
						a[0] = itemToInsert; 
				}
				else
				{
					keepGoing = false;
					a[j+1] = itemToInsert;
				}
			}
		}
	}

	public static void Quick(int[] a, int left, int right)
	{
		if (left>= right) return;
		int k = left;
		int j = right;
		int pivotValue = a[(left+right)/2]; //salient feature
		while(k<j)
		{
			while(a[k] < pivotValue) //salient feature (pivot point)
			{			
				k++;
			}
			while (pivotValue < a[j])
			{
				j--;
			}			
			if(k<=j)
			{
				int temp = a[k]; //swap a[k] & a[j]
				a[k] = a[j];
				a[j] = temp;
				k++;
				j--;
			}
		}
		Quick(a,left,j); //salient feature (recursion)
		Quick(a,k,right);
	}

	public static void Merge(int a[], int left, int right)
	{
		//Enter method with left = beginning index
		// and right = last index

		if(right == left) return;
		int middle = (left + right)/2;
		Merge(a, left, middle);
		Merge(a, middle+1, right);
		mergeWork(a, left, middle, right);
	}

	public static void mergeWork(int[] a, int left, int middle, int right)
	{
		//temp used to build merge list
		int tmpArray[] = new int[right - left + 1];

		//This creation of temp	is BIG feature	
		
		int index1 = left;
		int index2 = middle + 1;
		int index = 0;

		//Loop until one sublist is finished, add smaller
		//elements of each sublist to merged list
		while (index1 <= middle && index2 <= right)
		{
			if (a[index1] < a[index2])
			{
				tmpArray[index] = a[index1];			
				index1++;
			}
			else
			{
				tmpArray[index] = a[index2];
				index2++; 
			}
			index++;
		}

		//Add merged list to remaining elements
		//of whichever not yet finished
		while(index1 <= middle)
		{
			tmpArray[index] = a[index1];
			index1++;
			index++;
		}
		while(index2<=right)
		{
			tmpArray[index] = a[index2];
			index2++;
			index++;
		}

		//Copy merged list from tmpArray into a array
		for(index = 0; index<tmpArray.length; index++)
		{
			a[left+index] = tmpArray[index];
		}
	}
}
