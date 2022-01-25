class SumOfArr
{
    public static void main(String[] args)
    {
        int[] numbers = {45, 30, 100, 37, 56};
        int sum = 0;

        for (int num : numbers)
        {
            sum += num;
        }

        System.out.println(sum);
    }
}