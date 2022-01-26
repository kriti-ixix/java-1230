import java.util.Scanner;

class StudentsArr
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String[] names = {"ABC", "PQR", "JKL", "XYZ"};
        int[] rollno = new int[4];

        for (int i = 0; i < rollno.length; i++)
        {
            System.out.print("Enter number at index " + i + ": ");
            rollno[i] = sc.nextInt();
        } 

        for (int i = 0; i < rollno.length; i++)
        {
            System.out.println(rollno[i] + ". " + names[i]);
        } 
    }
}