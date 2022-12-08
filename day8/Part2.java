import java.util.*;

public class Part2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long ans = 0;
        List<char[]> list = new ArrayList<>();
        while (sc.hasNextLine()) {
            char[] s = sc.nextLine().toCharArray();
            list.add(s);
        }
        int n = list.get(0).length, m = list.size();
        for (int i = 1; i < n - 1; i++) {
            for (int j = 1; j < m - 1; j++) {
                char ch = list.get(i)[j];
                int cur = 1;
                for (int k = i - 1; k >= 0; k--) {
                    if (k == 0 || list.get(k)[j] >= ch) {
                        cur *= i - k;
                        break;
                    }
                }
                for (int k = j - 1; k >= 0; k--) {
                    if (k == 0 || list.get(i)[k] >= ch) {
                        cur *= j - k;
                        break;
                    }
                }
                for (int k = i + 1; k < n; k++) {
                    if (k == n - 1 || list.get(k)[j] >= ch) {
                        cur *= k - i;
                        break;
                    }
                }
                for (int k = j + 1; k < m; k++) {
                    if (k == m - 1 || list.get(i)[k] >= ch) {
                        cur *= k - j;
                        break;
                    }
                }
                ans = Math.max(ans, cur);
            }
        }
        System.out.println(ans);
    }
}
