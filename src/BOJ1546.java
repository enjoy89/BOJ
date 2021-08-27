import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ1546 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String[] nums = br.readLine().split(" ");
        double[] arr = new double[N];
        double max = 0;
        double sum = 0;

        for (int i = 0; i < nums.length; i++) {
            arr[i] = Double.parseDouble(nums[i]);
            if (max < arr[i]) {
                max = arr[i];
            }
        }

        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i] / max * 100;
            sum += arr[i];
        }
        System.out.println(sum / N);
    }
}
