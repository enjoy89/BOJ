import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class BOJ1874 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        Stack<Integer> stack = new Stack<>();
        StringBuilder sb = new StringBuilder();
        int start = 1;

        for (int i = 0; i < N; i++) {
            int value = Integer.parseInt(br.readLine());

            if (value >= start) {
                while (value >= start) {
                    stack.push(start++);
                    sb.append("+").append("\n");
                }
            }
            if (stack.peek() == value) {
                stack.pop();
                sb.append("-").append("\n");
            } else {
                System.out.println("NO");
                return;
            }
        }
        System.out.println(sb);
    }
}

