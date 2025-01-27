public class Ex1_1 {
    public static <T> void printArray(T[] array)
    {
        for (T member : array)
        {
            System.out.println(member);
        }
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
    }
}
