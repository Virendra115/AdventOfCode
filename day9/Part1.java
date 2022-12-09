import java.util.*;

public class Part1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long ans = 0;
        Set<String> set = new HashSet<>();
        set.add("0:0");
        int Hx = 0, Hy = 0, Tx = 0, Ty = 0, prex = 0, prey = 0;
        int[] dir = { 0, -1, 0, 1, 0 };
        while (sc.hasNextLine()) {
            char ch = sc.next().charAt(0);
            int c = sc.nextInt();
            int i = ch == 'D' ? 0 : ch == 'L' ? 1 : ch == 'U' ? 2 : 3;
            while (c-- > 0) {
                prex = Hx;
                prey = Hy;
                Hx += dir[i];
                Hy += dir[i + 1];
                if (Math.abs(Hx - Tx) > 1 || Math.abs(Hy - Ty) > 1) {
                    Tx = prex;
                    Ty = prey;
                    set.add(Tx + ":" + Ty);
                }
            }
        }
        System.out.println(set.size());
    }
}
