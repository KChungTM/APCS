public class Tetris extends famousGames
{
    private String name;    //Shadowed instance variable
    public Tetris(String name, String gameType, int rating)
    {
        super(name, gameType,rating);
        this.name = "(Shadowed) Chess";  
    }

    public void printName()
    {
        System.out.println("Game: " + name);
    }
}