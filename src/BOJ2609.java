import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ2609 {

    // 최대공약수 GCD
    // 유클리드 호제법 알고리즘
    // 두 수 num1, num2의 최대공약수는 (num1 % num2 = r일때) r과 num2의 최대공약수와 같다.
    // 즉 GCD(num1, num2) = GCD(num2, r)
    public static int gcd(int num1, int num2) {
        if (num2 == 0) {
            return num1;
        }
        return gcd(num2, num1 % num2);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int num1 = Integer.parseInt(st.nextToken());
        int num2 = Integer.parseInt(st.nextToken());

        int gcdNum = gcd(num1, num2);
        System.out.println(gcdNum);
        System.out.println(num1 * num2 / gcdNum);
    }
}
