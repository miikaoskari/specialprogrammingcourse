public class Ex1_2 {
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

    public static void main(String[] args) {
        // Test 2 - getBiggest
        Integer a = 10, b = 20, c = 15;
        Double d = 1.5, e = 5.3, f = 9.2;
        String s1 = "dog", s2 = "cat", s3 = "hamster";
        System.out.println(getBiggest(a, b, c));
        System.out.println(getBiggest(d, e, f));
        System.out.println(getBiggest(s1, s2, s3));
    }
}
