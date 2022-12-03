import java.util.*;

public class Part2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ans = 0;
        while (sc.hasNextLine()) {
            String s1 = sc.nextLine().strip();
            String s2 = sc.nextLine().strip();
            String s3 = sc.nextLine().strip();
            Set<Character> set1 = new HashSet<>();
            Set<Character> set2 = new HashSet<>();
            Set<Character> set3 = new HashSet<>();
            for (int i = 0; i < s1.length(); i++)
                set1.add(s1.charAt(i));
            for (int i = 0; i < s2.length(); i++)
                set2.add(s2.charAt(i));
            for (int i = 0; i < s3.length(); i++)
                set3.add(s3.charAt(i));
            for (char c : set1) {
                if (set2.contains(c) && set3.contains(c))
                    ans += c >= 'a' ? c - 'a' + 1 : c - 'A' + 27;
            }
        }
        System.out.println(ans);
    }
}
