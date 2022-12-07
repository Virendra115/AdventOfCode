import java.util.*;

public class Part1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long ans = 0, cur = 0;
        Stack<Long> st = new Stack<>();
        while (sc.hasNextLine()) {
            String[] s = sc.nextLine().split(" ");
            if (s[0].equals("$") && s[1].equals("cd")) {
                if (s[2].equals("..")) {
                    if (Long.compare(st.peek(), 100000L) <= 0)
                        ans += st.peek();
                    st.push(st.pop() + st.pop());
                } else {
                    st.push(0L);
                }
            } else if (s[0].matches("\\d+")) {
                st.push(st.pop() + Long.parseLong(s[0]));
            }
        }
        while (st.size() > 1) {
            if (Long.compare(st.peek(), 100000L) <= 0)
                ans += st.peek();
            st.push(st.pop() + st.pop());
        }
        System.out.println(st.peek());
        System.out.println(ans);
    }
}
