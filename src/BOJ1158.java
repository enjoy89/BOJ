import java.io.*;
import java.util.LinkedList;
import java.util.Queue;

public class BOJ1158 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        String[] str = br.readLine().split(" ");
        int N = Integer.parseInt(str[0]);
        int K = Integer.parseInt(str[1]);
        Queue<Integer> queue = new LinkedList<>();

        for (int i = 1; i <= N; i++) {
            queue.offer(i);
        }

        sb.append("<");
        while (queue.size() >= 1) {
            for (int i = 0; i < K; i++) {
                if (i == K - 1) {
                    if (queue.size() == 1) {
                        sb.append(queue.poll());
                    } else {
                        sb.append(queue.poll()).append(", ");
                    }
                } else {
                    queue.offer(queue.poll());
                }
            }
        }
        sb.append(">");
        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
    }
}
