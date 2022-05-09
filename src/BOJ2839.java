import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ2839 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int count = 0;

        // 그리디 알고리즘 적용
        // 봉지의 수는 최소, 5키로 봉지의 수가 최대가 되어야함
        while(true) {
            if(N % 5 == 0) {        // N이 5로 나누어 떨어지는 경우
                count += (N / 5);   // count에 몫을 더해줌
                break;
            } else if(N < 0) {      // N에서 3을 계속 빼주고 있으므로
                count = -1;         // N이 음수가 되어버린 경우 정확한 값을 구하지 못함
                break;
            }
            N -= 3;                 // N이 5로 나누어 떨어지지도 않고, N이 0보다 크면 (일반적인 경우)
            count++;                // 3키로 봉지를 사용했다고 치고 3을 빼고 count++ 함
        }
        System.out.println(count);

    }
}
