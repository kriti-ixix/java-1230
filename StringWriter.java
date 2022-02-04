import java.io.*;

class StringWriter
{
    public static void main(String[] args)
    {
        String name1 = "ABC";
        String name2 = "XYZ";

        try
        {
            File file = new File("Names.txt");
            FileWriter fileWriter = new FileWriter(file);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

            bufferedWriter.write(name1);
            bufferedWriter.newLine();
            bufferedWriter.write(name2);

            bufferedWriter.flush();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}