import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ1157 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        int[] nums = new int[26];
        int max = -1;
        char result = '?';

        for (int i = 0; i < nums.length; i++) {
            nums[i] = -1;
        }

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) >= 'a' && str.charAt(i) <= 'z') {
                nums[str.charAt(i) - 97]++;
            } else {
                nums[str.charAt(i) - 65]++;
            }
        }

        for (int i = 0; i < nums.length; i++) {
            if (max < nums[i]) {
                max = nums[i];
                result = (char) (i + 65);
            } else if (nums[i] == max) {
                result = '?';
            }
        }
        System.out.println(result);

    }
}
