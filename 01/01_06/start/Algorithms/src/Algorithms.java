public class Algorithms {


    public static String reverString(String s)
    {
        if(s==null || s.length() == 0)
        {
            return s;
        }
        StringBuilder reversed = new StringBuilder();

        for( int i= s.length() -1; i >= 0; i--)
        {
            reversed.append(s.charAt(i));
        }

        return reversed.toString();
    }
    public static void main(String[] args) {
        String s = "Hello My Friend";
        System.out.println(reverString(s));
        System.out.println(reverString("Java Programming"));
        System.out.println(reverString("Algorithms"));
        System.out.println(reverString("")); // Test with empty string
        System.out.println(reverString(null)); // Test with null input
        System.out.println(reverString("A")); // Test with single character
    }
}
