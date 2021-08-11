import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ2839 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int count = 0;

        while (true) {
            // N이 5로 나눠지는 경우
            if (N % 5 == 0) {
                count += (N / 5);
                System.out.println(count);
                break;
            } else if (N < 0) {     // N이 음수가 나온다면 -1 출력
                System.out.println(-1);
                break;
            }
            // N이 5로 안 나눠지는 경우
            // N에서 3씩 빼면서 0이 되면 다시 첫 번째 if문으로 돌아가 count 출력
            N -= 3;
            count++;
        }
    }
}
