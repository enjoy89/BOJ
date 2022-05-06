import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ5585 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int cost = Integer.parseInt(br.readLine());
        int count = 0;
        int[] coin = {500, 100, 50, 10, 5, 1};
        cost = 1000 - cost;
        for (int i = 0; i < coin.length; i++) {
            if (coin[i] <= cost) {
                count += (cost / coin[i]);
                cost %= coin[i];
            }
        }
        System.out.println(count);
    }
}
