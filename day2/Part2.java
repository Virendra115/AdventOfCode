import java.util.*;

public class Part2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ans = 0;
        while (sc.hasNextLine()) {
            char s1 = sc.next().charAt(0);
            char s2 = sc.next().charAt(0);
            if (s2 == 'X') {
                ans += s1 == 'A' ? 3 : s1 == 'B' ? 1 : 2;
            } else if (s2 == 'Y') {
                ans += 3 + s1 - 'A' + 1;
            } else {
                ans += 6 + (s1 == 'A' ? 2 : s1 == 'B' ? 3 : 1);
            }
        }
        System.out.println(ans);
    }
}
