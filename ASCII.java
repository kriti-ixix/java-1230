import java.util.Scanner;

class ASCII
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a character: ");
        char c = sc.next().charAt(0);
        int code = (int) c;
        System.out.println("ASCII Code for " + c + " is " + code);
    }
}