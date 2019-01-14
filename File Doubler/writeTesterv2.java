import java.io.*;
import java.util.Scanner;

public class writeTesterv2
{
    public static void main(String[] args) throws IOException
    {
        try{
            System.out.println("Please check your directory for the modified: " + args[0] + args[1]);
        }
        catch (ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Please make sure you entered the file name and percent increase correctly!");
            System.out.println("For Example: java writeTester *insert File name w/ extension* *Percent Increase”);
            System.exit(0);
        }

	   double increaseNum = args[1]/100;	
        File file = new File(args[0]);
        Scanner kboard = new Scanner(file);
        String newFileName;

        //  Checks to see if args[0] contains file extension
        //  Uses newFileName to later rename class
        if (args[0].contains("."))
        {
            String[] fileName = args[0].split("\\W");
            fileName[0] = fileName[0] + "x" + increaseNum;
            newFileName = fileName[0] + "." + fileName[1];
        }
        else
        {
            newFileName = args[0] + "x" + increaseNum;
        }

        //  Set false to wipe text file || Set true to append to previous
        FileWriter fw = new FileWriter(newFileName, false);
        PrintWriter output = new PrintWriter(fw);
        String nxtLine;

        //  Loop to begin reading file and writing
        while(kboard.hasNextLine())
        {
            nxtLine = kboard.nextLine();

            if (nxtLine.contains("public class"))
            {
                    output.println(nxtLine + "x" + increaseNum);
            }
            else
            {
                if (onBlackList(nxtLine))
                {
                    output.println(nxtLine);
                }
                else
                {
                    String[] sentence = nxtLine.split("\\D+");

                    //  Prints the split
                    //for (String word : sentence)
                    //    System.out.print(word);
                    
                    //  Replaces numbers
                    nxtLine = nxtLine.replaceAll("\\d+", "tExTeDiToRiSaLpHa");

                    //  Replaces phrase with numbers in array
                    for (int i = 0; i<sentence.length; i++)
                    {
                        if (sentence[i].matches("[0-9]+"))
                        nxtLine = nxtLine.replaceFirst("tExTeDiToRiSaLpHa", Integer.parseInt(sentence[i]) * increaseNum + "");
                    }
                    output.println(nxtLine);
                }
            }
        }
        
        output.close();
        fw.close();
    }

    //  Method to check if line contains words on blacklist 
    private static boolean onBlackList(String line)
    {
        String[] blacklist ={
                                "import",
                                "Color",
                                "sleep",
                                "rgb",
                            }; 
        for(String word : blacklist)
        {
            if (line.contains(word))
                return true;
        }
        return false;
    }
}
