public class Customer
{
    private String name;
    private int idNum;

    public Customer(String cusName, int ID)
    {
        name = cusName;
        idNum = ID;
    }

    public String getName()
    {
        return name;
    }

    public int getID()
    {
        return idNum;
    }

    public int compareCustomer(Customer other)
    {
        if (getName().compareTo(other.getName()) == 0)
        {
            if (getID() == other.getID())
                return (0);
            else if (getID() > other.getID())
                return (1);
            else
                return (-1);
        }
        else
        {
            if (getName().compareTo(other.getName()) > 0)
                return (1);
            else
                return (-1);
        }
    }
}