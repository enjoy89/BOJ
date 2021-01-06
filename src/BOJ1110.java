import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ1110 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int cycle = 0;
        int next = N;

        while(true) {
            N = ((N % 10) * 10) + (((N / 10) + (N % 10)) % 10);
            cycle++;
            if(next == N) {
                break;
            }
        }
        System.out.println(cycle);
    }
}

