public class ModFib
{
    public static int modFibonacci(int term)
    {
        if (term == 0)
            return 3;
        else if (term == 1)
            return 5;
        else if (term == 2)
            return 8;
        else
            return (modFibonacci(term - 1) + modFibonacci(term-2) + modFibonacci(term-3));
    }
}