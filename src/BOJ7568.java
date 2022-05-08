import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 입력: 사람 수 N / 각 사람의 몸무게와 키 정보
 * 출력: 각 덩치 등수
 * 풀이 과정 - 모든 경우의 수를 다 고려해야 하므로 브루트포스 알고리즘을 이용하여 풀이
 * 먼저 사람 수 N에 따라 [N][2] 크기의 배열을 생성하고 입력으로 받은 몸무게와 키 정보를 저장.
 * 각각의 사람의 몸무게와 키를 모두 비교해야하므로 2중 for문으로 배열 탐색
 */
public class BOJ7568 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[][] arr = new int[N][2];
        String[] nums;

        for (int i = 0; i < N; i++) {
            nums = br.readLine().split(" ");
            arr[i][0] = Integer.parseInt(nums[0]);  // 몸무게
            arr[i][1] = Integer.parseInt(nums[1]);  // 키
        }

        for (int i = 0; i < N; i++) {
            int rank = 1;
            for (int j = 0; j < N; j++) {
                if ((arr[i][0] < arr[j][0]) && (arr[i][1] < arr[j][1])) {
                    rank++;
                }
            }
            System.out.print(rank + " ");
        }
    }
}
