import java.io.*;
import java.util.Stack;

public class BOJ1406 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] str = br.readLine().split("");
        int M = Integer.parseInt(br.readLine());
        Stack<String> LeftStack = new Stack<>();
        Stack<String> RightStack = new Stack<>();

        for (int i = 0; i < str.length; i++) {
            LeftStack.push(str[i]);
        }

        while (M-- > 0) {
            String[] input = br.readLine().split(" ");

            switch (input[0]) {
                case "L":
                    if (!LeftStack.isEmpty()) {
                        RightStack.push(LeftStack.pop());
                    }
                    break;
                case "D":
                    if (!RightStack.isEmpty()) {
                        LeftStack.push(RightStack.pop());
                    }
                    break;
                case "B":
                    if (!LeftStack.isEmpty()) {
                        LeftStack.pop();
                    }
                    break;
                case "P":
                    String value = input[1];
                    LeftStack.push(value);
                    break;
                default:
                    break;
            }
        }
        while (!LeftStack.isEmpty()) {
            RightStack.push(LeftStack.pop());
        }
        while (!RightStack.isEmpty()) {
            bw.write(RightStack.pop());
        }

        bw.flush();
        bw.close();
    }
}
