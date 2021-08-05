import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ1929 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        StringBuilder sb = new StringBuilder();
        int M = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(st.nextToken());

        // 에라토스테네스의 체 알고리즘
        // k = 2부터 √N 이하까지 반복하여 자연수들 중 k를 제외한 k의 배수들을 제외시킴
        boolean[] prime = new boolean[N + 1];
        prime[0] = prime[1] = true;

        for (int i = 2; i <= Math.sqrt(N); i++) {
            if (prime[i]) {
                continue;
            }
            for (int j = 2; i * j < prime.length; j++) {
                prime[i * j] = true;
            }
        }

        for (int i = M; i <= N; i++) {
            if (!prime[i]) {
                sb.append(i).append("\n");
            }
        }
        System.out.println(sb);
    }
}
