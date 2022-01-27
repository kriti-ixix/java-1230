import java.util.*;

class MyArrayList
{
    public static void main(String[] args)
    {
        ArrayList<Integer> numbers = new ArrayList<>();
        System.out.println(numbers.size());

        numbers.add(5);
        numbers.add(10);
        numbers.add(-100);
        numbers.add(50);

        System.out.println(numbers.size());
        System.out.println(numbers.get(2));
        System.out.println(numbers.clear());
    }
}