import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ10950 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            String[] nums = br.readLine().split(" ");
            int result = Integer.parseInt(nums[0]) + Integer.parseInt(nums[1]);
            System.out.println(result);
        }
    }
}
