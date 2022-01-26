import java.util.Scanner;

class Example
{
    public static void main(String[] args)
    {
        System.out.println("Hello world!");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = sc.next();
        System.out.println("Hello " + name + "!");
    }
}