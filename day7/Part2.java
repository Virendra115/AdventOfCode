import java.util.*;

public class Part2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Long> st = new Stack<>();
        TreeSet<Long> set = new TreeSet<>();
        while (sc.hasNextLine()) {
            String[] s = sc.nextLine().split(" ");
            if (s[0].equals("$") && s[1].equals("cd")) {
                if (s[2].equals("..")) {
                    set.add(st.peek());
                    st.push(st.pop() + st.pop());
                } else {
                    st.push(0L);
                }
            } else if (s[0].matches("\\d+")) {
                st.push(st.pop() + Long.parseLong(s[0]));
            }
        }
        while (st.size() > 1) {
            set.add(st.peek());
            st.push(st.pop() + st.pop());
        }
        set.add(st.peek());
        System.out.println(set.ceiling(30000000L - (70000000L - st.peek())));
    }
}
