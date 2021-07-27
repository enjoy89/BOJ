import java.io.*;

public class BOJ10989 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];
        int[] result = new int[arr.length];
        int max = 0;

        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        int[] counting = new int[max + 1];

        for (int k : arr) {
            counting[k]++;
        }

        for (int i = 1; i < counting.length; i++) {
            counting[i] += counting[i - 1];
        }

        for (int i = arr.length - 1; i >= 0; i--) {
            int value = arr[i];
            counting[arr[i]]--;
            result[counting[arr[i]]] = value;
        }
        for (int j : result) {
            bw.write(j + "\n");
        }
        bw.flush();
    }
}
