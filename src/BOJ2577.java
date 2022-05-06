import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ2577 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String ABC = String.valueOf(Integer.parseInt(br.readLine()) * Integer.parseInt(br.readLine()) * Integer.parseInt(br.readLine()));
        int[] arr = new int[10];

        for (int i = 0; i < arr.length; i++) {
            int count = 0;
            for (int j = 0; j < ABC.length(); j++) {
                if ((ABC.charAt(j) - '0') == i) {
                    count++;
                }
            }
            System.out.println(count);
        }
    }
}

