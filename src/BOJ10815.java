import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class BOJ10815 {
    private static int[] get_card;
    private static int[] test_card;

    public static int BinarySearch(int target) {
        int left = 0;
        int right = get_card.length - 1;
        int mid;

        while (left <= right) {
            mid = (left + right) / 2;
            if (target > get_card[mid]) {
                left = mid + 1;
            } else if (target < get_card[mid]) {
                right = mid - 1;
            } else {
                return mid;
            }
        }
        return -1;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String[] str = br.readLine().split(" ");
        get_card = new int[N];

        for (int i = 0; i < N; i++) {
            get_card[i] = Integer.parseInt(str[i]);
        }
        Arrays.sort(get_card);

        int M = Integer.parseInt(br.readLine());
        String[] str2 = br.readLine().split(" ");
        test_card = new int[M];

        for (int i = 0; i < M; i++) {
            test_card[i] = Integer.parseInt(str2[i]);
        }

        for (int i = 0; i < test_card.length; i++) {
            int result = BinarySearch(test_card[i]);
            if (result != -1) {
                System.out.print(1 + " ");
            } else {
                System.out.print(0 + " ");
            }
        }
    }
}
