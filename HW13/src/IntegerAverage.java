import java.util.ArrayList;
import java.util.OptionalDouble;
import java.util.stream.Collectors;

public class IntegerAverage {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>(5);
        for (int i = 0; i < 5; i++) {
            arr.add(i, (int) (Math.random() * 15));
        }
        System.out.println(arr);
        System.out.println(averageStream(arr));
        System.out.println(averageStream2(arr));
    }

   static OptionalDouble averageStream(ArrayList<Integer> arr) {
       return arr.stream().mapToInt(s -> s).average();
    }

    static double averageStream2(ArrayList<Integer> arr) {
        return arr.stream().collect(Collectors.averagingInt(Integer::shortValue));
    }

}
