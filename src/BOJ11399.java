import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class BOJ11399 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String[] str = br.readLine().split(" ");
        int[] nums = new int[N];

        for (int i = 0; i < N; i++) {
            nums[i] = Integer.parseInt(str[i]);
        }
        Arrays.sort(nums);
        int temp = 0;

        for (int i = 1; i < N; i++) {
            nums[i] = nums[i - 1] + nums[i];
        }
        for (int i = 0; i < N; i++) {
            temp += nums[i];
        }
        System.out.println(temp);
    }
}
