import java.util.Scanner;

public class ArrayCrawler
{
	public static void main(String[] args)
   	{
		Scanner kboard = new Scanner(System.in);

		int[] nums1 = { 1, 2, 4, 6, 7, 9, 13, 14, 17 };
		int[] nums2 = { 0, 3, 5, 8, 9, 11, 12, 14, 17, 18, 20};

		System.out.println("Which method do you want?");
		System.out.println("1. Brute Force?");
		System.out.println("2. Elegant and The Natural Way");
		System.out.println("==================");
        
        String answer = kboard.nextLine();

        if (answer.contains("1"))
            System.out.println(lowestCommon1(nums1, nums2));
        else if(answer.contains("2"))
            System.out.println(lowestCommon2(nums1, nums2));
        else
        {
            System.out.println("Please enter either 1 or 2!");
            System.exit(0);
        }
	
   	}

   	public static int lowestCommon1(int[] nums1, int[] nums2)
   	{
		int firstIndex = 0;
		int secondIndex = 0;

		while (nums1[firstIndex] != nums2[secondIndex])
		{
			while (nums1[firstIndex] > nums2[secondIndex])
			{
				secondIndex++;
			}

			if (nums1[firstIndex] == nums2[secondIndex])
			{
				return nums1[firstIndex];
			}
			firstIndex++;
        }
        return 256;
   	}

	public static int lowestCommon2(int[] nums1, int[] nums2)   
    {
		int common = 999999999;

		for (int i = 0; i < nums1.length; i++)
		{
			for (int j = 0; j < nums2.length; j++)
			{
					if (nums1[i] == nums2[j] && nums2[j] < common)
						common = nums2[j];
			}
		}
		return common;					       
   	}
}
