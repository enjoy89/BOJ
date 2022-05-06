import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class BOJ10809 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        int[] arr = new int[26];
        int index;
        Arrays.fill(arr, -1);   // 배열 초기화

        for (int i = 0; i < str.length(); i++) {
            index = str.charAt(i) - 'a';

            if (arr[index] == -1) {
                arr[index] = i;
            }
        }
        /*
        // 방법 2
        // indexOf() 함수는 문자열의 위치를 반환한다.
        // 해당 문자가 처음으로 등장하는 위치를 리턴, 해당 문자가 존재하지 않으면 -1을 리턴.
        for (char c = 'a'; c <= 'z'; c++) {
            System.out.print(str.indexOf(c) + " ");
        }
         */

        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
