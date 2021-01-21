import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ10809 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();

        /*
        // 방법 1
        // indexOf() 함수는 문자열의 위치를 반환한다.
        // 해당 문자가 처음으로 등장하는 위치를 리턴, 해당 문자가 존재하지 않으면 -1을 리턴.
        for (char c = 'a'; c <= 'z'; c++) {
            System.out.print(str.indexOf(c) + " ");
        }
         */

        // 방법 2
        int[] arr = new int[26];
        for (int i = 0; i < arr.length; i++) {      // 배열 초기화
            arr[i] = -1;
        }

        for (int i = 0; i < str.length(); i++) {
            int index = str.charAt(i) - 'a';

            if(arr[index] == -1) {
                arr[index] = i;
            }
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
