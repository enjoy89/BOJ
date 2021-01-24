import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class BOJ2751 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int N = input.nextInt();
        ArrayList<Integer> nums = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            nums.add(input.nextInt());
        }
        Collections.sort(nums);

        for (int i : nums) {
            sb.append(i).append('\n');
        }
        System.out.println(sb);
    }
}
