import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ2675 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {
            String[] str = br.readLine().split(" ");    // String 배열에 공백 기준으로 나눠 저장한다.
            int R = Integer.parseInt(str[0]);
            String S = str[1];

            for (int j = 0; j < S.length(); j++) {
                for (int k = 0; k < R; k++) {
                    System.out.print(S.charAt(j));
                }
            }
            System.out.println();
        }
    }
}
