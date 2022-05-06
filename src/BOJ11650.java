import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class BOJ11650 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[][] arr = new int[N][2];

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");   // 문자열을 공백 기준으로 나눈다. 이를 토큰이라고 부름
            arr[i][0] = Integer.parseInt(st.nextToken());   // 다음 토큰을 반환
            arr[i][1] = Integer.parseInt(st.nextToken());
        }
        // 2차원 배열 정렬
        // 0번째 요소가 같으면 1번째 요소끼리 비교
        // 0번째 요소가 다르면 0번째 요소끼리 비교
        Arrays.sort(arr, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                if(o1[0] == o2[0]) {
                    return Integer.compare(o1[1], o2[1]);
                } else {
                    return Integer.compare(o1[0], o2[0]);
                }
            }
        });

        for (int[] ints : arr) {
            for (int j = 0; j < 2; j++) {
                System.out.print(ints[j] + " ");
            }
            System.out.println();
        }
    }
}
