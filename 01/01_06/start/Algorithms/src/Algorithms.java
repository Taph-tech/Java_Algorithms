public class Algorithms {

public static String reverse(String s){
    StringBuilder reversed = new StringBuilder();

    if (s== null || s.isEmpty()){
        return s;
    }
    for (int i= s.length() -1; i >= 0; i--){
        reversed.append(s.charAt(i));
    }
    return reversed.toString();
} 
    public static void main(String[] args) {
        String input = "Hey, Bestie!";
        String reversedInput = reverse(input);
        System.out.println("Original is: " + input);
        System.out.println("Reversed is: " + reversedInput);
    }
}
