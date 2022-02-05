import java.util.Scanner;
import java.io.*;

class ScannerOperations
{
    public static void main(String[] args)
    {
        try
        {
            File file = new File("Names.txt");
            Scanner sc = new Scanner(file);

            while (sc.hasNext())
            {
                System.out.println(sc.next());
            }

            sc.close();
        }   
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}