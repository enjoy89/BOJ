import java.util.Scanner;

public class BOJ1546 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        double[] arr = new double[N];
        double max = 0;
        double sum = 0;

        for (int i = 0; i < N; i++) {
            arr[i] = input.nextDouble();
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
