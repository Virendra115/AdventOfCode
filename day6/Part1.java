import java.util.*;

public class Part1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int ans = s.length();
        for (int i = 3; i < s.length(); i++) {
            Set<Character> set = new HashSet<>();
            for (int j = i - 3; j <= i; j++)
                set.add(s.charAt(j));
            if (set.size() == 4) {
                ans = i + 1;
                break;
            }
        }
        System.out.println(ans);
    }
}
