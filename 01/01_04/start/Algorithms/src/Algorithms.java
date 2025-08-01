public class Algorithms {

    public static void parseContents(String c){
        System.out.println("Option 1");
        for (char s : c.toCharArray() ){
            System.out.print(s);
        }


        System.out.println("\nOption 2");
        for (int i =0; i<c.length(); i++){
            System.out.print(c.charAt(i));
        }
    }
    public static void main(String[] args) {
        String s = "HeLLo";
        System.out.println(s.contains("LL"));
        parseContents(s);
    }
}
