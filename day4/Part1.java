import java.util.*;

public class Part1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ans = 0;
        while (sc.hasNextLine()) {
            String[] arr = sc.nextLine().split(",");
            int[] a = Arrays.stream(arr)
                    .flatMap(str -> Arrays.stream(str.split("-")))
                    .map(Integer::parseInt)
                    .mapToInt(i -> i)
                    .toArray();
            if (a[0] >= a[2] && a[1] <= a[3])
                ans++;
            else if (a[2] >= a[0] && a[3] <= a[1])
                ans++;
        }
        System.out.println(ans);
    }
}
