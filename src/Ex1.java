import java.util.*;

public class Ex1 {
    public static <T> void printArray(T[] array)
    {
        for (T member : array)
        {
            System.out.println(member);
        }
    }

    public static <T extends Comparable<T>> T getBiggest(T a, T b, T c)
    {
        T max = a;
        if (b.compareTo(max) > 0)
        {
            max = b;
        }
        if (c.compareTo(max) > 0)
        {
            max = c;
        }
        return max;
    }

    public static <T> void swapFirstLast(ArrayList<T> arrlist)
    {
        Collections.swap(arrlist, 0, arrlist.size() - 1);
    }

    public static <N extends Number> Number calcSum(N[] array)
    {
        return Arrays.stream(array).mapToDouble(Number::doubleValue).sum();
    }

    public static void main(String[] args)
    {
        // Test 1 - printArray
        Integer[] arr_of_ints = {123, 323, 223, 113, 133};
        Double[] arr_of_dbls = {1.1, 1.5, 1.9, 2.3, 3.8};
        Character[] arr_of_chars = {'t', 'e', 's', 't'};
        String[] arr_of_strs = {"hello", "world"};

        printArray(arr_of_ints);
        printArray(arr_of_dbls);
        printArray(arr_of_chars);
        printArray(arr_of_strs);

        // Test 2 - getBiggest
        Integer a = 10, b = 20, c = 15;
        Double d = 1.5, e = 5.3, f = 9.2;
        String s1 = "dog", s2 = "cat", s3 = "hamster";
        System.out.println(getBiggest(a, b, c));
        System.out.println(getBiggest(d, e, f));
        System.out.println(getBiggest(s1, s2, s3));

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

        // Test 4 - calcSum
        Integer[] arr_of_ints2 = {1, 2, 3, 4, 5};
        Double[] arr_of_dbls2 = {1.1, 1.2, 3.2, 4.9, 3.5};
        System.out.println(calcSum(arr_of_ints2));
        System.out.println(calcSum(arr_of_dbls2));
    }

}
