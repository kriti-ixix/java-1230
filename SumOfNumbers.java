class SumOfNumbers
{
    public static void main(String[] args)
    {
        int number = 5;
        int loopTotal = 0;

        for (int i = 1; i <= number; i++)
        {
            loopTotal += i;
        }

        System.out.println(loopTotal);

        Testing t = new Testing();
        int recTotal = t.sum(number);
        System.out.println(recTotal);
    }
}

class Testing
{
    int sum(int n)
    {
        if (n == 1)
        {
            return n;
        }
        else
        {
            return n + sum(n - 1);
        }
    }
}