import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Ex1_3 {
    public static <T> void swapFirstLast(ArrayList<T> arrlist)
    {
        Collections.swap(arrlist, 0, arrlist.size() - 1);
    }
    public static void main(String[] args) {
        // Test 3 - swapFirstLast
        ArrayList<Integer> arrlist_of_ints = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        ArrayList<Double> arrlist_of_dbls = new ArrayList<>(Arrays.asList(1.1, 1.2, 3.2, 4.9, 3.5));
        ArrayList<String> arrlist_of_strs = new ArrayList<>(Arrays.asList("dog", "cat", "hamster"));

        swapFirstLast(arrlist_of_ints);
        System.out.println(arrlist_of_ints);
        swapFirstLast(arrlist_of_dbls);
        System.out.println(arrlist_of_dbls);
        swapFirstLast(arrlist_of_strs);
        System.out.println(arrlist_of_strs);
    }
}
