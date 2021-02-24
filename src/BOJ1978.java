import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ1978 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] nums = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int count = 0;

        for (int i = 0; i < N; i++) {
            nums[i] = Integer.parseInt(st.nextToken());     // 토큰을 하나씩 불러서 배열에 입력
        }

        for (int i = 0; i < nums.length; i++) {
            boolean isPrime = true;     // 소수인 경우 true, 아닐 경우 false
            if (nums[i] == 1) {
                isPrime = false;
            }
            for (int j = 2; j < nums[i]; j++) {
                if (nums[i] % j == 0) {
                    isPrime = false;
                }
            }
            if (isPrime) {
                count++;
            }
        }
        System.out.println(count);
    }
}
