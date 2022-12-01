import java.util.*;
import java.io.*;

public class Part1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ans = 0, cur = 0;
        while (sc.hasNextLine()) {
            String s = sc.nextLine();
            if (s.length() == 0) {
                ans = Math.max(ans, cur);
                cur = 0;
            } else {
                cur += Integer.parseInt(s);
            }
        }
        System.out.println(ans);
    }
}
