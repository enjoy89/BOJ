import java.io.*;

public class BOJ10926 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String id = br.readLine();
        bw.write(id+"??!");

        bw.flush();
        bw.close();
        br.close();
    }
}
