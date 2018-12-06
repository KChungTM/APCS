/*
Note:   Shadowed instance variable in Tetris class
        Overloaded/Overridden method in Fortnite.java
*/

public class Tester
{
    public static void main(String[] args)
    {
        famousGames[] games = new famousGames[4];

        games[0] = new Fortnite("Fortnite", "Battle Royale", 5);
        games[1] = new Tetris("Tetris", "Stategy", 7);
        games[2] = new CSGO("CS:GO", "FPS", 7);
        games[3] = new Roblox("Roblox", "E(B)IC Game", 10);

        games[0].printTitle("Fortnite");
        System.out.println();

        for (famousGames game: games)
        {
            game.printName();
            game.printgameType();
            game.printRating();
            System.out.println();  
        }
    }
}