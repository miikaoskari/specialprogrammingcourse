import java.util.HashMap;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Stream;

public class Ex3_3 {
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
        scanner.close();

        HashMap<String, Integer> stringHashMap = getSubstrings(list_of_strs);

        Stream<String> str_stream = stringHashMap.keySet().stream();
        str_stream.forEach(member -> System.out.println(member + ": " + stringHashMap.get(member)));

        str_stream = stringHashMap.keySet().stream().filter(member -> stringHashMap.get(member) > 2);
        HashMap<String, Integer> filteredMap = str_stream.collect(HashMap::new, (map, member)
                -> map.put(member, stringHashMap.get(member)), HashMap::putAll);

        str_stream = filteredMap.keySet().stream();
        str_stream.forEach(member -> System.out.println(member + ": " + filteredMap.get(member)));
    }
}
