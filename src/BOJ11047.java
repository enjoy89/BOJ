import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ11047 {
    public static void main(String[] args) throws IOException {
        // 그리디 알고리즘
        // N개의 동전 중 가장 큰 가치를 지닌 동전부터 탐색한다.
        // 동전의 가치가 K보다 클 경우에는 패스, 아닐 경우 최대 구성 가능한 개수를 더해줌
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        int[] coin = new int[N];
        int count = 0;

        for (int i = 0; i < N; i++) {
            coin[i] = Integer.parseInt(br.readLine());
        }

        // 가장 큰 가치를 지닌 동전부터 탐색함
        for (int i = coin.length - 1; i >= 0; i--) {
            if (coin[i] <= K) {
                count += (K / coin[i]);
                K %= coin[i];
            }
        }
        System.out.println(count);
    }
}