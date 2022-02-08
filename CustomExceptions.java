import java.util.Scanner;

class CustomExceptions
{
    public static void main(String[] args)
    {
        try
        {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter email: ");
            String email = sc.next();
            System.out.print("Enter password: ");
            String password = sc.next();

            if (password.length() < 8)
                throw new PasswordTooShortException("Password is of length " + password.length());

            System.out.println("Login successful!");

        }
        catch (Exception ex)
        {
            ex.printStackTrace();
        }
    }
}

class PasswordTooShortException extends Exception
{
    PasswordTooShortException(String message)
    {
        super(message);
        System.out.println("Password should be minimum 8 characters");
    }
}