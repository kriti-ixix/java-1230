class Vowels
{
    public static void main(String[] args)
    {
        char c = 'e';

        switch (c)
        {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
            System.out.println("Vowel");
            break;

            default:
            System.out.println("Consonant");
        }
    }
}