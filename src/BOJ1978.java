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

        for (int num : nums) {
            boolean isPrime = num != 1;     // 소수인 경우 true, 아닐 경우 false
            for (int j = 2; j < num; j++) {
                if (num % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                count++;
            }
        }
        System.out.println(count);
    }
}
