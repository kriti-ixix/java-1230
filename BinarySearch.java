class BinarySearch
{
    public static void main(String[] args)
    {
        int[] numbers = {23, 30, 45, 56, 68, 80, 90};
        int number = 30;
        int first = 0;
        int last = numbers.length - 1;
        
        while (first <= last)
        {
            int mid = (first + last) / 2;
            System.out.println("Middle index is " + mid);

            if (numbers[mid] == number) // Found the element at the middle
            {
                System.out.println("Found " + number + " at index " + mid);
                break;
            }
            else if (numbers[mid] < number) // Number is smaller
            {
                first = mid + 1;
            }
            else if (numbers[mid] > number) // Number is greater
            {
                last = mid - 1;
            }
        }

    }
}