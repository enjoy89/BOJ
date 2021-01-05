import java.io.*;

public class BOJ15552 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int t = Integer.parseInt(bf.readLine());

        for(int i=0; i<t; i++) {
            String[] arr = bf.readLine().split(" ");    // 공백을 기준으로 문자열을 나눠 배열에 저장
            int result = Integer.parseInt(arr[0]) + Integer.parseInt(arr[1]);
            bw.write(Integer.toString(result)+"\n");

        }
        bw.flush();
        bw.close();
    }
}
