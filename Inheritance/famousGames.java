public class famousGames
{
    private String name;
    private int rating;
    private String gameType;

    public famousGames(String enterName, String enterType, int enterRating)
    {
        name = enterName;
        gameType = enterType;
        rating = enterRating;
    }

    public void printName()
    {
        System.out.println("Game: " + name);
    }

    public void printRating()
    {
        System.out.println("Rating: " + rating);
    }

    public void printgameType()
    {
        System.out.println("Game Type: " + gameType);
    }

    public void printTitle(String name)
    {
        System.out.println("Bad Games Reviews");
    }
}