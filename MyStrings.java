class MyStrings
{
    public static void main(String[] args)
    {
        String s1 = "Hello world";
        String s2 = "How are you?";

        System.out.println(s1 + s2);
        System.out.println(s1.concat(s2));

        char c = s1.charAt(6);
        System.out.println(c);

        System.out.println(s1.length());

        System.out.println(s1.toUpperCase());
        System.out.println(s1.toLowerCase());

        System.out.println(s1.equals(s2));
        System.out.println(s1.equals("hello world"));
        System.out.println(s1.equalsIgnoreCase("hello world"));

        System.out.println(s1.indexOf("o"));
        System.out.println(s1.lastIndexOf("o"));

        System.out.println(s1.substring(2, 9));

        String message = "Hi, how are you?";
        String[] words = message.split(" ");
        System.out.println(words.length);
    }
}