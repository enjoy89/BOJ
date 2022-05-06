import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class BOJ1157 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        int[] nums = new int[26];   // 대소문자 구분 없이 26개
        int max = -1;
        char result = '?';

        Arrays.fill(nums, -1);

        // 대소문자 상관 없이 배열의 인덱스는 0부터 시작한다.
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) >= 'a' && str.charAt(i) <= 'z') {     // 소문자
                nums[str.charAt(i) - 97]++;
            } else {        // 대문자
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
