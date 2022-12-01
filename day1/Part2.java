
import java.util.*;

public class Part2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ans = 0, cur = 0;
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        while (sc.hasNextLine()) {
            String s = sc.nextLine();
            if (s.length() == 0) {
                pq.offer(cur);
                if (pq.size() > 3)
                    pq.poll();
                cur = 0;
            } else {
                cur += Integer.parseInt(s);
            }
        }
        while (!pq.isEmpty())
            ans += pq.poll();
        System.out.println(ans);
    }
}
