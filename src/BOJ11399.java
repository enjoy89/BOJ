import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ11399 {

    public static int[] Insertion_sort(int[] arr) {
        int temp;

        for (int i = 1; i < arr.length; i++) {
            int key = i;
            for (int j = i - 1; j >= 0; j--) {
                if (arr[key] < arr[j]) {
                    temp = arr[key];
                    arr[key] = arr[j];
                    arr[j] = temp;
                    key = j;
                }
            }
        }
        return arr;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];
        String[] str = br.readLine().split(" ");

        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(str[i]);
        }

        int[] sort_arr = Insertion_sort(arr);
        int sum = 0;

        for (int i = 1; i < sort_arr.length; i++) {
            arr[i] = arr[i] + arr[i - 1];
        }

        for (int i : sort_arr) {
            sum += i;
        }
        System.out.println(sum);

    }
}
