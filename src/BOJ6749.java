import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ6749 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num1 = Integer.parseInt(br.readLine());
        int num2 = Integer.parseInt(br.readLine());
        int num3 = num2 - num1;

        System.out.println(num2 + num3);

    }
}
