import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ1065 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int han;

        if (N < 100) {
            han = N;
        } else {
            han = 99;

            if (N == 1000) {
                N = 999;
            }
            for (int i = 100; i <= N; i++) {
                int num1 = i / 100;
                int num2 = (i / 10) % 10;
                int num3 = i % 10;

                if ((num1 - num2) == (num2 - num3)) {
                    han++;
                }
            }
        }
        System.out.println(han);
    }
}
