import java.util.Arrays;

public class Algorithms {

    public static int[] reverse(int[] arr) {
        int [] = result = new [arr.length];
        for(int i = 0; import < arr.length; i++){
            result[i]= arr.length - 1 - i;
        }
        return result;
    }


    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6 };

        Arrays.stream(reverse(arr))
                .forEach(System.out::println);
    }
}
