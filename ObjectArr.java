class ObjectArr
{
    public static void main(String[] args)
    {
        StdData[] students = new StdData[3];

        for (int i = 0; i < students.length; i++)
        {
            StdData std = new StdData();
            std.name = "ABC";
            std.rollno = 3;
            std.subject = "JAVA";
            students[i] = std;
        }

        for (StdData std: students)
        {
            System.out.println(std.rollno +  ". " + std.name + " " + std.subject);
        }

    }
}

class StdData
{
    String name;
    int rollno;
    String subject;
}