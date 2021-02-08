import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;

public class BOJ2108 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        ArrayList<Integer> arrayList = new ArrayList<>();
        int[] arr = new int[N];
        int temp;
        double sum = 0;
        int[] count = new int[8001];    // -4000 ~ 4000
        int max = 0;

        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        Arrays.sort(arr);

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        System.out.println((int) Math.round(sum / N));  // 산술평균
        System.out.println(arr[N / 2]); // 중앙값


        for (int i = 0; i < arr.length; i++) {
            int index = (arr[i] + 4000);
            count[index]++;
        }
        // 최빈값의 최대인덱스를 찾는다.
        for (int i = 0; i < count.length; i++) {
            if (max <= count[i]) {
                max = count[i];
            }
        }

        for (int i = 0; i < count.length; i++) {
            if (count[i] == max) {
                int value = i - 4000;
                arrayList.add(value);
            }
        }

        // 최빈값
        if (arrayList.size() == 1) {
            System.out.println(arrayList.get(0));   // 최빈값이 하나일 때
        } else {
            System.out.println(arrayList.get(1));   // 최빈값이 여러개일 때
        }
        System.out.println(arr[arr.length - 1] - arr[0]);   // 범위

    }
}
