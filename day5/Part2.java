import java.util.*;

public class Part2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ans = 0;
        List<String> str = new ArrayList<>();
        while (true) {
            String s = sc.nextLine();
            if (Character.isDigit(s.charAt(1)))
                break;
            str.add(s);
        }
        List<Stack<Character>> list = new ArrayList<>();
        for (int i = 1; i < str.get(0).length(); i += 4) {
            Stack<Character> st = new Stack<>();
            for (int j = str.size() - 1; j >= 0; j--) {
                char ch = str.get(j).charAt(i);
                if (ch == ' ')
                    break;
                st.push(ch);
            }
            list.add(st);
        }
        sc.nextLine();
        while (sc.hasNextLine()) {
            String[] ls = sc.nextLine().split(" ");
            int k = Integer.parseInt(ls[1]), f = Integer.parseInt(ls[3]), t = Integer.parseInt(ls[5]);
            Stack<Character> tmp = new Stack<>();
            while (k-- > 0) {
                tmp.push(list.get(f - 1).pop());
            }
            while (!tmp.isEmpty())
                list.get(t - 1).push(tmp.pop());
        }
        StringBuilder res = new StringBuilder();
        for (Stack<Character> st : list)
            res.append(st.peek());
        System.out.println(res);
    }
}
