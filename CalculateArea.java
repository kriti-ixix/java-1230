import java.util.Scanner;

class CalculateArea
{
    public static void main(String[] args)
    {
        try
        {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter length: ");
            int length = sc.nextInt();
            System.out.print("Enter breadth: ");
            int breadth = sc.nextInt();

            if (length < 0 || breadth < 0)
                throw new ArithmeticException();

            int area = length * breadth;
            System.out.println("Area is " + area);
        }

        catch (ArithmeticException e)
        {
            System.out.println("Length and breadth cannot be negative");
        }
        
    }
}