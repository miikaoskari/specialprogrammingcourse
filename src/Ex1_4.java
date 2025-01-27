import java.util.Arrays;

public class Ex1_4 {
    public static <N extends Number> Number calcSum(N[] array)
    {
        return Arrays.stream(array).mapToDouble(Number::doubleValue).sum();
    }

    public static void main(String[] args) {
        // Test 4 - calcSum
        Integer[] arr_of_ints = {1, 2, 3, 4, 5};
        Double[] arr_of_dbls = {1.1, 1.2, 3.2, 4.9, 3.5};
        System.out.println(calcSum(arr_of_ints));
        System.out.println(calcSum(arr_of_dbls));
    }
}
