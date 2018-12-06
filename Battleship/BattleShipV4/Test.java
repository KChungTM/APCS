public class Test
{
    public static void main(String[] args)
    {
        int randomIndex;
        for (int i = 0; i < 100; i++)
        {
            randomIndex = (int)((Math.random() * 5));
            System.out.println(randomIndex);
        }
    }
}