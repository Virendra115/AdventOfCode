import java.util.*;

public class Part1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ans = 0;
        while (sc.hasNextLine()) {
            char s1 = sc.next().charAt(0);
            char s2 = sc.next().charAt(0);
            if (s1 == 'C' && s2 == 'X')
                ans += 6;
            else if (s1 == 'B' && s2 == 'Z')
                ans += 6;
            else if (s1 == 'A' && s2 == 'Y')
                ans += 6;
            else if (s1 == s2 - 23)
                ans += 3;
            ans += s2 - 'W';
        }
        System.out.println(ans);
    }
}
