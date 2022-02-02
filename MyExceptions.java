import java.util.*;

class MyExceptions
{
    public static void main(String[] args)
    {
        try
        {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter a number: ");
            int number = sc.nextInt();
            System.out.println("The number is " + number);

            int[] numbers = {34, 45, 100, 200, 50};
            System.out.println("The value is " + numbers[number]);
        }
        catch (ArrayIndexOutOfBoundsException e)
        {
            System.out.println("The index does not exist");
        }
        catch (InputMismatchException e)
        {
            System.out.println("The number is invalid");
        }
        finally
        {
            System.out.println("End of program... Thank you!");
        }
    }
}