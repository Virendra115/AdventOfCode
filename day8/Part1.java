import java.util.*;

public class Part1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long ans = 0;
        List<char[]> list = new ArrayList<>();
        while (sc.hasNextLine()) {
            char[] s = sc.nextLine().toCharArray();
            list.add(s);
        }
        int n = list.get(0).length, m = list.size();
        boolean[][] visible = new boolean[n][m];
        for (int i = 0; i < n; i++) {
            visible[i][0] = true;
            char c = list.get(i)[0];
            for (int j = 1; j < m; j++) {
                if (list.get(i)[j] > c)
                    visible[i][j] = true;
                c = (char) Math.max(c, list.get(i)[j]);
            }
            visible[i][m - 1] = true;
            c = list.get(i)[m - 1];
            for (int j = m - 2; j > 0; j--) {
                if (list.get(i)[j] > c)
                    visible[i][j] = true;
                c = (char) Math.max(c, list.get(i)[j]);
            }
        }
        for (int j = 0; j < n; j++) {
            visible[0][j] = true;
            char c = list.get(0)[j];
            for (int i = 1; i < n; i++) {
                if (list.get(i)[j] > c)
                    visible[i][j] = true;
                c = (char) Math.max(c, list.get(i)[j]);
            }
            visible[n - 1][j] = true;
            c = list.get(n - 1)[j];
            for (int i = n - 2; i > 0; i--) {
                if (list.get(i)[j] > c)
                    visible[i][j] = true;
                c = (char) Math.max(c, list.get(i)[j]);
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (visible[i][j])
                    ans++;
            }
        }
        System.out.println(ans);
    }
}
