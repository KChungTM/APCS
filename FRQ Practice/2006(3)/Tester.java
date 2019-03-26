import java.util.Arrays;

public class Tester
{
    public static void main (String[] args)
    {
        Customer[] list1 =  {
            new Customer("Arthur", 4920),
            new Customer("Burton", 3911),
            new Customer("Burton", 4944),
            new Customer("Franz", 1692),
            new Customer("Horton", 9221),
            new Customer("Jones", 5554),
            new Customer("Miller", 9360),
            new Customer("Nguyen", 4339)
                            };

        Customer[] list2 =  {
            new Customer("Aaron", 1729),
            new Customer("Baker", 2921),
            new Customer("Burton", 3911),
            new Customer("Dillard", 6552),
            new Customer("Jones", 5554),
            new Customer("Miller", 9360),
            new Customer("Noble", 3335),
                            };

        Customer[] result = new Customer[6];

        prefixMerge(list1, list2, result);

        for(Customer customer: result)
        {
            System.out.print(customer.getName() + ", " + customer.getID());
            System.out.println("");
        }
    }

    public static void prefixMerge (Customer[] list1, Customer[] list2, Customer[] result)    
    {
        int index1 = 0;
        int index2 = 0;
        int resultIndex = 0;

        while (resultIndex < result.length)
        {
            if (list1[index1].compareCustomer(list2[index2]) == 0)
            {
                result[resultIndex] = list1[index1];
                index1++;
                index2++;
            }
            else if (list1[index1].compareCustomer(list2[index2]) < 0)
            {
                result[resultIndex] = list1[index1];
                index1++;
            }
            else
            {
                result[resultIndex] = list2[index2];
                index2++;
            }
            resultIndex++;
        }
    }
}


