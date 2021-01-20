import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class BOJ4344 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int C = Integer.parseInt(br.readLine());

        for (int i = 0; i < C; i++) {
            String[] s = br.readLine().split(" ");
            int[] nums = Arrays.stream(s).mapToInt(Integer::parseInt).toArray();
            double sum = 0;
            int count = 0;

            for (int j = 1; j < nums.length; j++) {
                sum += nums[j];
            }

            for (int j = 1; j < nums.length; j++) {
                if (nums[j] > (sum / nums[0])) {
                    count++;
                }
            }
            System.out.printf("%.3f%%\n", (double) count / nums[0] * 100);
        }
    }
}

