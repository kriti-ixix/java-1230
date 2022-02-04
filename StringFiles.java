import java.io.*;

class StringFiles
{
    public static void main(String[] args)
    {
        try
        {
            File inputFile = new File("Input.txt");
            FileReader fileReader = new FileReader(inputFile);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line; int num = 1;

            while ((line = bufferedReader.readLine()) != null)
            {
                System.out.println(num + ". " + line);
                num++;
            }
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}