public class SelectionSort
{
    public static void main(String[] args)
    {
        int theArray[] = {4,2,5,1,3,18,0,9,6};
        SelectionSort(theArray);

        for(int value: theArray)
        {
            System.out.print(value + " ");
        }
        System.out.println(" ");
    }

    public static void SelectionSort(int[] a)
    {
        int min, minIndex;
        for(int i=0; i<a.length; ++i)
        {
            min=a[i];
            minIndex=i;
            for(int j=i+1; j<a.length; ++j)
            {
                if (a[j]<min) //salient feature
                {
                    min=a[j];
                    minIndex=j;
                }
            }
            a[minIndex]=a[i]; //swap
            a[i]=min;
        }
    }
}