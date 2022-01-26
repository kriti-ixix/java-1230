class School
{
    public static void main(String[] args)
    {
        Student s1 = new Student();
        s1.name = "ABC";
        s1.rollno = 1;
        s1.course = "Java";
        s1.calFees();
        double s1Fees = s1.getFees();

        Student s2 = new Student("XYZ");
        s2.rollno = 2;
        s2.course = "Web";
        s2.calFees(6);
        double s2Fees = s2.getFees();

        double totalFees = s1Fees + s2Fees;
        System.out.println("Total fees to collect: " + totalFees);
    }
}

class Student
{
    String name;
    int rollno;
    String course;
    double fees;

    Student()
    {
        System.out.println("Welcome to our school!");
    }

    Student(String n)
    {
        name = n;
        System.out.println("Welcome to our school, " + n + "!");
    }

    void calFees(int months)
    {
        fees = 5000 * months;
        System.out.println("Your fees is " + fees);
    }

    void calFees()
    {
        fees = 5000;
        System.out.println("Your fees is " + fees);
    }

    double getFees()
    {
        return fees;
    }

}