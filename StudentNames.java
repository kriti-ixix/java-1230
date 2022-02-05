import java.util.*;
import java.io.*;

class StudentNames
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> namesList = new ArrayList<>();

        System.out.print("Enter the number of students: ");
        int num = sc.nextInt();

        for (int i = 0; i < num; i++)
        {
            System.out.print("Enter name at " + i + ": ");
            String name = sc.next();
            namesList.add(name);
        }

        try
        {
            File file = new File("Names.txt");
            FileWriter fw = new FileWriter(file, true);
            BufferedWriter bw = new BufferedWriter(fw);

            for (String name : namesList)
            {
                bw.append(name);
                bw.newLine();
            }

            bw.flush();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }

    }
}