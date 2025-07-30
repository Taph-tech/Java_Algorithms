public class Algorithms {


    public static void main(String[] args) {

        System.out.println(isPassWordComplex("Hello123"));
        System.out.println(isPassWordComplex("Hello"));
        System.out.println(isPassWordComplex("Hello$"));

    }

    public static boolean isPassWordComplex(String str){
        return str.chars().anyMatch(Character::isUpperCase) && 
        str.chars().anyMatch(Character::isLowerCase) && 
        str.chars().anyMatch(Character::isDigit);

        //Or the below can be used
       /*  return str.chars().anyMatch(c -> Character.isUpperCase(c) ||
                Character.isLowerCase(c)|| Character.isDigit(c));*/
    }
}
