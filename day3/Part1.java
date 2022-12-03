import java.util.*;

public class Part1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ans = 0;
        while (sc.hasNextLine()) {
            String s = sc.nextLine().strip();
            Set<Character> s1 = new HashSet<>();
            Set<Character> s2 = new HashSet<>();
            for (int i = 0; i < s.length() / 2; i++)
                s1.add(s.charAt(i));
            for (int i = s.length() / 2; i < s.length(); i++)
                s2.add(s.charAt(i));
            for (char c : s1) {
                if (s2.contains(c))
                    ans += c >= 'a' ? c - 'a' + 1 : c - 'A' + 27;
            }
        }
        System.out.println(ans);
    }
}
