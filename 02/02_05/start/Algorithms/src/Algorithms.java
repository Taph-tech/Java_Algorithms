import java.util.Arrays;

public class Algorithms {

    public static int[] reverse(int[] arr) {
        int[]  result = new int[arr.length];
        for(int i = 0; i< arr.length; i++){
            result[i]= arr[ arr.length - 1 - i];
        }
        return result;
    }

  public static void reverseInplace(int [] arr){
    for (int i= 0; i< arr.length/2; i++) {
        int temp = arr[i];
        arr[i] = arr[arr.length - i - 1];
        arr[arr.length - i - 1] = temp;
    }
  }
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6 };

       /* Arrays.stream(reverse(arr))
                .forEach(System.out::println); */
                reverseInplace(arr);
                reverseInplace(arr);
                Arrays.stream(arr).forEach(System.out::println);
    }
}
