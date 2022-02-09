import java.util.*;

class MyCalendar
{
    public static void main(String[] args)
    {
        Calendar cal = Calendar.getInstance();
        Date date = cal.getTime();
        System.out.println(date.getInfo());

        cal.set(Calendar.MONTH, 5);
        cal.set(Calendar.YEAR, 2000);
        date = cal.getTime();
        System.out.println(date.getInfo());
    }
}