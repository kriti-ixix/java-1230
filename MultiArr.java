class MultiArr
{
    public static void main(String[] args)
    {
        int[][] numbers = new int[2][3];
        int num=1;

        for (int row = 0; row < numbers.length; row++)
        {
            for (int col = 0; col < numbers[row].length; col++)
            {
                numbers[row][col] = num;
                num++;
            }
        }

        for (int row = 0; row < numbers.length; row++)
        {
            for (int col = 0; col < numbers[row].length; col++)
            {
                System.out.print(numbers[row][col] + " ");
            }
            System.out.println();
        }

    }
}