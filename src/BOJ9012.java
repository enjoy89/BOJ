import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class BOJ9012 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        while (T-- > 0) {
            String str = br.readLine();
            Stack<Character> stack = new Stack<>();
            boolean isVPS = true;

            for (int i = 0; i < str.length(); i++) {
                char c = str.charAt(i);

                if (c == '(') {
                    stack.push(c);
                } else {
                    if (stack.isEmpty()) {
                        isVPS = false;
                        break;
                    }
                    stack.pop();
                }
            }

            if (stack.isEmpty() && isVPS) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }

    }
}
