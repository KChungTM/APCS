public class Fortnite extends famousGames
{
    public Fortnite(String name, String gameType, int rating)
    {
        super(name,gameType,rating);
    }

    public void printgameType()
    {
        System.out.println("(Overriden) Text Editor Master race");
    }

    public void printRating()
    {
        System.out.println("(Overriden) Text Editor Master race");
    }

    public void printName()
    {
        System.out.println("(Overriden) Text Editor Master race");
    }

    public void printTitle(String name)
    {
        System.out.println("Bad Games That Aren't " + name);
    }
}