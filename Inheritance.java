class MyStudent // Parent or base class
{
    String name;
    int rollno;
    char section = 'A';

    void getInfo()
    {
        System.out.println(rollno + ". " +  name);
    }
}

class MyExams extends MyStudent // Child or derived class
{
    double marks;
    String subject;
    char section = 'C';

    void getPercentage()
    {
        double percentage = (marks * 100) / 65;
        System.out.println(percentage + "% in " + subject);
    }
}

class Inheritance
{
    public static void main(String[] args)
    {
        MyExams e1 = new MyExams();
        // e1.name = "ABC";
        // e1.rollno = 4;
        // e1.marks = 50.5;
        // e1.subject = "JAVA";

        // e1.getInfo();
        // e1.getPercentage();
        System.out.println(e1.section);

        MyStudent s1 = new MyStudent();
        System.out.println(s1.section);
    }
}