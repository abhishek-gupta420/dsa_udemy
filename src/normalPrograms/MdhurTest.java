import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class MdhurTest {
    public static void main(String[] args) {
        List<String> a = new ArrayList<>();
        a.add("cdab");
        a.add("abcd");

        List<String> b = new ArrayList<>();
        b.add("dcba");
        b.add("abcd");

        int n = a.size();
        List<String> result = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            List<Character> odd_a = new ArrayList<>();
            List<Character> even_a = new ArrayList<>();
            List<Character> odd_b = new ArrayList<>();
            List<Character> even_b = new ArrayList<>();

            int j = a.get(i).length();
            int k = b.get(i).length();

            if (j == k) {
                for (int l = 0; l < j; l++) {
                    if (l % 2 == 0) {
                        odd_a.add(a.get(i).charAt(l));
                        odd_b.add(b.get(i).charAt(l));
                    } else {
                        even_a.add(a.get(i).charAt(l));
                        even_b.add(b.get(i).charAt(l));
                    }
                }
            } else {
                result.add("No");
                break;
            }

            if (new HashSet<>(odd_a).equals(new HashSet<>(odd_b)) && new HashSet<>(even_a).equals(new HashSet<>(even_b))) {
                result.add("Yes");
            } else {
                result.add("No");
            }
        }

        System.out.println(result);
    }
}


