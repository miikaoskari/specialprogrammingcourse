import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class Ex2_2 {
    public static HashMap<String, Integer> getSubstrings(List<String> strings)
    {
        HashMap<String, Integer> substringsHashMap = new HashMap<>();

        for (String member : strings)
        {
            for (int i = 1; i <= member.length(); i++)
            {
                String substring = member.substring(0, i);
                substringsHashMap.put(substring, substringsHashMap.getOrDefault(substring, 0) + 1);
            }
        }
        return substringsHashMap;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter strings (empty to stop): ");

        List<String> list_of_strs = new java.util.ArrayList<>();
        String input = scanner.nextLine();
        while (!input.isEmpty())
        {
            list_of_strs.add(input);
            input = scanner.nextLine();
        }

        HashMap<String, Integer> stringHashMap = getSubstrings(list_of_strs);

        for (String member : stringHashMap.keySet())
        {
            System.out.println(member + ": " + stringHashMap.get(member));
        }
    }
}
