import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class BOJ1271 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str = br.readLine().split(" ");
        BigInteger a = new BigInteger(str[0]);
        BigInteger b = new BigInteger(str[1]);

        System.out.println(a.divide(b));
        System.out.println(a.mod(b));
    }
}
