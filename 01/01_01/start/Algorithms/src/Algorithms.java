public class Algorithms {


    public static boolean isUppercase(String str)
    {
        return str.chars().noneMatch(Character::isUpperCase);
        //return str.chars().allMatch(Character::isUpperCase);
    }

     public static boolean isLowercase(String str)
    {
        return str.chars().allMatch(Character::isUpperCase);
    }
    public static void main(String[] args) {

        System.out.println(isUppercase("Hello"));
        System.out.println(isUppercase("HELLO"));
        System.out.println(isUppercase("hello"));

    }
}
