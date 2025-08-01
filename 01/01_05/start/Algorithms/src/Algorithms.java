public class Algorithms {

    public static boolean isAtEvenIndex(String s, char item) {
        if( s== null || s.isEmpty()){
            return false;
        }
        for (int i = 0; i < s.length()/2+1; i += 2) {
            if (s.charAt(i) == item) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        // Test cases
        System.out.println(isAtEvenIndex("hello", 'h')); // true
        System.out.println(isAtEvenIndex("hello", 'e')); // false
        System.out.println(isAtEvenIndex("hello", 'l')); // true
        System.out.println(isAtEvenIndex("hello", 'o')); // false
        System.out.println(isAtEvenIndex("", 'a')); // false
        System.out.println(isAtEvenIndex(null, 'a')); // false

    }
}
