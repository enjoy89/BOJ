import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ11047 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] nums = br.readLine().split(" ");
        int N = Integer.parseInt(nums[0]);  // 동전 종류의 개수
        int K = Integer.parseInt(nums[1]);  // 동전 가치의 합
        int count = 0;

        // 동전의 가치를 입력 받아 정수형 배열로 구성
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        // 가치가 큰 동전부터 비교해야하므로 배열의 끝에서부터 시작함
        // 동전보다 K의 값이 크면 해당 동전의 가치로 나눈 몫을 count에 더해주고 나머지 값을 K에 저장
        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] <= K) {
                count += (K / arr[i]);
                K %= arr[i];
            }
        }
        System.out.println(count);
    }
}