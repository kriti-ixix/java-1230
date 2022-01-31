import java.util.*;
import java.time.*;
import java.util.concurrent.TimeUnit;

class DateDifference
{
    public static void main(String[] args)
    {
        Calendar cal = Calendar.getInstance();
        Date currentDate = cal.getTime();
        System.out.println("Current date: " + currentDate);

        Calendar cal2 = Calendar.getInstance();
        cal2.set(Calendar.MONTH, 4);
        cal2.set(Calendar.YEAR, 2021);
        Date newDate = cal2.getTime();
        System.out.println("Current date: " + newDate);
        
        long difference = cal.getTime().getTime() - cal2.getTime().getTime();
        System.out.println("Difference is " + difference + " milliseconds");

        long days = TimeUnit.DAYS.convert(difference, TimeUnit.MILLISECONDS);
        System.out.println("Difference is " + days + " days");
    }
}