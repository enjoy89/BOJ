import java.io.*;
import java.util.*;

public class BOJ1026 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] arr_A = new int[N];
        Integer[] arr_B = new Integer[N];
        int S = 0;

        String[] str_a = br.readLine().split(" ");
        String[] str_b = br.readLine().split(" ");

        for (int i = 0; i < N; i++) {
            arr_A[i] = Integer.parseInt(str_a[i]);
            arr_B[i] = Integer.parseInt(str_b[i]);
        }

        Arrays.sort(arr_A);
        Arrays.sort(arr_B, Collections.reverseOrder());

        for (int i = 0; i < N; i++) {
            S += (arr_A[i] * arr_B[i]);
        }
        System.out.println(S);
    }
}
