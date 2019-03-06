//the recursive algorithm:
//So your recursive method's signature might look like this:

public class towerOfHanoi
{
    private static int moves;

    public static void doTheFrigginSteps(int numDisks, int fromPost, int sparePost, int toPost)
    {
        if (numDisks == 1)
        {
            moveOne(fromPost, toPost, numDisks);
            moves++;
        }
        else
        {
            moves++;
            //System.out.println(fromPost + "->" toPost);
            doTheFrigginSteps(numDisks-1, fromPost, toPost, sparePost); //put on spare
            moveOne(fromPost, toPost, numDisks);
            doTheFrigginSteps(numDisks-1, sparePost, fromPost, toPost);
            //System.out.println(fromPost + "->" + toPost); (Error)
        }
    }
    //end case:  If you just have one disk, moveOne(fromPost, toPost)
    //recursive case:  move N-1 disks to the spare post, then move the Nth disk to the destination post, then move the N-1 stack from the spare to the destination post

    //simplest moveOne method:

    public static void moveOne(int fromPost, int toPost, int diskNum)
    {
        System.out.println("(Disk " + diskNum + ") " + fromPost + " -> " + toPost);
    }

    public static int FRICKINWORKUCUCK()
    {
        return moves;
    }
}

/*
Examples:
---------
disk# = 2
{
  Process 1:
disk 1 > spare
disk 2 > end

Process 2
disk 1 > end  
}

disk# = 3
{
    Process 1:
    disk 1 + 2 > spare

    Process 1A:
    used 2 disc example above
    but set spare as end and set 
    end as spare

    Process 2:
    disk 3 > end

    Process 3:
    do process 1A again
}
*/
 