import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ1152 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str = br.readLine().split(" ");
        int count = str.length;

        if (str.length == 0) {
            count = 0;
        } else if (str[0].isEmpty()) {
            count -= 1;
        }
        System.out.println(count);
    }
}
