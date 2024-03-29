import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ11720 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String[] nums = br.readLine().split("");
        int sum = 0;

        for (String num : nums) {
            sum += Integer.parseInt(num);
        }
        System.out.println(sum);
    }
}
