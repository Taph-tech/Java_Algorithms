public class Algorithms {
     
    public static String normalizeString(String s)
    {
        return s.toLowerCase().trim().replace(",","");
        // String lowerCase = s.toLowerCase();
        // String trimmed = lowerCase.trim();
        // String normalized = trimmed.replace(",","");
        // return normalized;
    }

    public static void main(String[] args) {
        System.out.println(normalizeString("  Hello, There Buddy!  "));
        
    }
}
