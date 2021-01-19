import java.util.Scanner;

public class BOJ3052 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] arr = new int[10];
        int result = 0;

        for (int i = 0; i < arr.length; i++) {
            arr[i] = input.nextInt() % 42;
        }

        for (int i = 0; i < arr.length; i++) {
            int count = 0;
            for (int j = i + 1; j < arr.length; j++) {
                if(arr[i] == arr[j]) {
                    count++;
                }
            }
            if(count == 0) {
                result++;
            }
        }
        System.out.println(result);
    }
}
