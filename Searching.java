class Searching
{
    public static void main(String[] args)
    {
        int[] numbers = {45, 30, 100, 37, 56};
        int element = 37;

        for (int i=0; i<numbers.length; i++)
        {
            if (numbers[i] == element)
            {
                System.out.println("Found " + element + " at index " + i);
                break;
            }
        }
    }
}