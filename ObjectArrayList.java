import java.util.*;

class ObjectArrayList
{
    public static void main(String[] args)
    {
        ArrayList<StdData> students = new ArrayList<>();
        StdData std = new StdData();
        std.name = "ABC";
        std.rollno = 4;
        std.subject = "JAVA";  
        students.add(std);
        System.out.println(students);
    }
}