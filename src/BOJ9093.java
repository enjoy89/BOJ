import java.io.*;
import java.util.Stack;

public class BOJ9093 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            Stack<String> stack = new Stack<>();
            String[] str = br.readLine().split("");
            StringBuilder sb = new StringBuilder("");

            for (int j = 0; j < str.length; j++) {
                if (str[j].equals(" ") || str[j].equals("\n")) {
                    while (!stack.isEmpty()) {
                        sb.append(stack.pop());
                    }
                    sb.append(" ");
                } else {
                    stack.push(str[j]);
                }
            }
            while (!stack.isEmpty()) {
                sb.append(stack.pop());
            }
            bw.write(sb.toString() + " \n");
            bw.flush();
        }
        br.close();
        bw.close();
    }
}
