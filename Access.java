class Access
{
    public static void main(String[] args)
    {
        Parent p1 = new Parent();
        p1.getInfo();
        Child c1 = new Child();
        c1.getInfo();
    }
}

class Parent
{
    String email = "kriti@gmail.com";
    private String password = "1234";
    private String creditCard = "9876543210";

    protected void getInfo()
    {
        System.out.println("Email: " + email);
        System.out.println("Password: " + password);
        System.out.println("Credit Card: " + creditCard);
    }
}

private class Child extends Parent
{
    String customerName = "XYZ";

    void getInfo()
    {
        System.out.println("Name: " + customerName);
        System.out.println("Email: " + email);
        // System.out.println("Password: " + password);
        // System.out.println("Credit Card: " + creditCard);
    }
}