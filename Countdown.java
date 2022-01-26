class Countdown
{
    public static void main(String[] args)
    {
        int start = 4;

        switch (start)
        {
            case 5:
            System.out.print("5... ");

            case 4:
            System.out.print("4... ");

            case 3:
            System.out.print("3... ");

            case 2:
            System.out.print("2... ");

            case 1:
            System.out.print("1... ");

            case 0:
            System.out.println("0... ");

            default:
            System.out.println("Let's go!");
        }
    }
}