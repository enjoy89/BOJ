import java.io.*;
import java.util.StringTokenizer;

public class BOJ18258 {

    private static int[] queue;
    private static int Front = -1;
    private static int Rear = -1;
    private static int size = 0;
    static StringBuilder sb = new StringBuilder();

    public static void push(int X) {
        queue[++Rear] = X;
        size++;
    }

    public static void pop() {
        if (Front == Rear) {
            sb.append(-1).append("\n");
        } else {
            Front = Front + 1;
            int value = queue[Front];
            queue[Front] = 0;
            size--;
            sb.append(value).append("\n");
        }
    }

    public static void empty() {
        if (Front == Rear) {
            sb.append(1).append("\n");
        } else {
            sb.append(0).append("\n");
        }
    }

    public static void size() {
        sb.append(size).append("\n");
    }

    public static void front() {
        if (size == 0) {
            sb.append(-1).append("\n");
        } else {
            sb.append(queue[Front + 1]).append("\n");
        }
    }

    public static void back() {
        if (size == 0) {
            sb.append(-1).append("\n");
        } else {
            sb.append(queue[Rear]).append("\n");
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        queue = new int[N];
        StringTokenizer st;

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine(), " ");

            switch (st.nextToken()) {
                case "push":
                    push(Integer.parseInt(st.nextToken()));
                    break;
                case "pop":
                    pop();
                    break;
                case "size":
                    size();
                    break;
                case "empty":
                    empty();
                    break;
                case "front":
                    front();
                    break;
                case "back":
                    back();
            }
        }
        System.out.println(sb);
    }
}
