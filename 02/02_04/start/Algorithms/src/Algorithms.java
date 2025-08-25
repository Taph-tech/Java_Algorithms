import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.IntPredicate;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class Algorithms {

    public static int[] findEvenNums(int[] arr1, int[] arr2) {
       ArrayList<Integer> result = new ArrayList<>();
        for(int number: arr1){
            if(number % 2 == 0 && number < 0){
                result.add(number);
            }
        }
            
        for (int number2: arr2){
            if(number2 % 2 == 0 && number2 < 0){
                result.add(number2);
            }
        }  
        
        return result.stream().mapToInt(Integer::intValue).toArray();
    }

     public static int[] findEvenNums2(int[] arr1, int[] arr2) {
        IntPredicate isEvenPredicate = number -> number % 2 == 0; //&& number < 0;

        return Stream.of(arr1, arr2)
                    .flatMapToInt(Arrays::stream)
                 .filter(isEvenPredicate)
                 .toArray();

}


    public static void main(String[] args) {
        int[] arr1 = { -9, 3, 2, -8, 12, -16 };
        int[] arr2 = { 0, -3, -8, -35, 40, 20, 7 };
        
        Arrays.stream(findEvenNums(arr1, arr2))
                .forEach(System.out::println);
        System.out.println("---- Seccond Method ----");
        Arrays.stream(findEvenNums2(arr1, arr2))
                .forEach(System.out::println);
    }
}
