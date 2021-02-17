import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;

public class BOJ15792 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] nums = br.readLine().split(" ", -1);
        System.out.println(new BigDecimal(nums[0]).divide(new BigDecimal(nums[1]), 1000, BigDecimal.ROUND_HALF_UP));
        br.close();

    }
}
