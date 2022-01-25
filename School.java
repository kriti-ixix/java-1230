class School
{
    public static void main(String[] args)
    {
        Student s1 = new Student();
        s1.name = "ABC";
        s1.rollno = 1;
        s1.course = "Java";

        Student s2 = new Student();
        s2.name = "XYZ";
        s2.rollno = 2;
        s2.course = "Web";
    }
}

class Student
{
    String name;
    int rollno;
    String course;
    double fees;
}