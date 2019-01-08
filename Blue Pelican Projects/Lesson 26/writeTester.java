import java.io.*;
import java.util.Scanner;

public class writeTester
{
    public static void main(String[] args) throws IOException
    {
        File txt = new File("sampleText1.txt");
        Scanner kboard = new Scanner(txt);
        FileWriter fw = new FileWriter("sampleText2.txt", true);
        PrintWriter output = new PrintWriter(fw);
        String nxtLine;

        while(kboard.hasNextLine())
        {
            nxtLine = kboard.nextLine();
            String[] sentence = nxtLine.split("\\D+");

            //Prints the split
            for (String word : sentence)
                System.out.print(word);
            
            //Replaces numbers
            nxtLine = nxtLine.replaceAll("\\d+", "CaShBeTa><XxXBoi");

            //Replaces phrase with numbers in array
            for (int i = 0; i<sentence.length; i++)
            {
                if (sentence[i].matches("[0-9]+"))
                nxtLine = nxtLine.replaceFirst("CaShBeTa><XxXBoi", Integer.parseInt(sentence[i]) * 2 + "");
            }
        
            System.out.println(nxtLine);
            output.println(nxtLine);
        }
        
        output.close();
        fw.close();
    }
}