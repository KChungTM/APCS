import java.io.*;
import java.util.Scanner;

public class writeTester
{
    public static void main(String[] args) throws IOException
    {
        File txt = new File(args[0]);
        Scanner kboard = new Scanner(txt);

        //set false to wipe text file || set true to append to previous
        FileWriter fw = new FileWriter("sampleText2.txt", false);

        PrintWriter output = new PrintWriter(fw);
        String nxtLine;

        while(kboard.hasNextLine())
        {
            nxtLine = kboard.nextLine();
            String[] sentence = nxtLine.split("\\D+");

            //Prints the split
            //for (String word : sentence)
            //    System.out.print(word);
            
            //Replaces numbers
            nxtLine = nxtLine.replaceAll("\\d+", "tExTeDiToRiSaLpHa");

            //Replaces phrase with numbers in array
            for (int i = 0; i<sentence.length; i++)
            {
                if (sentence[i].matches("[0-9]+"))
                nxtLine = nxtLine.replaceFirst("tExTeDiToRiSaLpHa", Integer.parseInt(sentence[i]) * 2 + "");
            }
        
            System.out.println(nxtLine);
            output.println(nxtLine);
        }
        
        output.close();
        fw.close();
    }
}