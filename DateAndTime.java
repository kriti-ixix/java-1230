import java.util.*;
import java.text.*;

class DateAndTime
{
    public static void main(String[] args)
    {
        Date date = new Date();
        System.out.println(date.toString());

        SimpleDateFormat sdf = new SimpleDateFormat("dd-MMM-yyyy");
        String formattedDate = sdf.format(date);
        System.out.println(formattedDate);
    }
}