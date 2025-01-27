import java.util.*;

public class Ex2_1 {
    public static <T> void printUniquesAndCount(List<T> list)
    {
        Set<T> uniques = new HashSet<>(list);
        for (T unique : uniques)
        {
            System.out.println(unique);
        }
        System.out.println("unique count: " + uniques.size());
    }

    public static <T> void printList(List<T> list)
    {
        for (T member : list)
        {
            System.out.println(member);
        }
    }

    public static void main(String[] args) {
        // Test 1 - with 50 random integers from 1 to 30
        List<Integer> list_of_ints = new ArrayList<>();
        Random rand = new Random();
        for (int i = 0; i < 50; i++)
        {
            list_of_ints.add(rand.nextInt(30) + 1);
        }

        printList(list_of_ints);
        printUniquesAndCount(list_of_ints);

        // Test 2 - with string array
        List<String> list_of_strs = Arrays.asList("apple", "banana", "cherry", "date", "apple", "banana", "cherry", "date", "apple", "banana", "cherry", "date");

        printList(list_of_strs);
        printUniquesAndCount(list_of_strs);
    }
}
