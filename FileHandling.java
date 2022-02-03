import java.io.*;

class FileHandling
{
    public static void main(String[] args)
    {
        try
        {
            File f1 = new File("Input.txt");
            File f2 = new File("Output.txt");

            FileInputStream fis = new FileInputStream(f1);
            FileOutputStream fos = new FileOutputStream(f2);

            int x;

            while ((x = fis.read()) != -1)
            {
                fos.write(x);
            }
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}