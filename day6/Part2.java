import java.util.*;

public class Part2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int ans = s.length();
        for (int i = 13; i < s.length(); i++) {
            Set<Character> set = new HashSet<>();
            for (int j = i - 13; j <= i; j++)
                set.add(s.charAt(j));
            if (set.size() == 14) {
                ans = i + 1;
                break;
            }
        }
        System.out.println(ans);
    }
}
