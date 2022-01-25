class LargestNumber
{
    public static void main(String[] args)
    {
        int[] numbers = {45, 30, 100, 37, 56};
        int largestNumber = numbers[0];

        for (int i=0; i < numbers.length; i++)
        {
            if (numbers[i] > largestNumber)
            {
                largestNumber = numbers[i];
            }
            
            System.out.println("Largest number: " + largestNumber);
        }
    }
}