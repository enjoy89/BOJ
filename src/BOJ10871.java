import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ10871 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str = br.readLine().split(" ");
        int num1 = Integer.parseInt(str[0]);
        int num2 = Integer.parseInt(str[1]);

        String[] arr = br.readLine().split(" ");
        for (int i = 0; i < num1; i++) {
            if (Integer.parseInt(arr[i]) < num2) {
                System.out.print(Integer.parseInt(arr[i]) + " ");
            }
        }
    }
}
