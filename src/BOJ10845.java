import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ10845 {

    private static int[] queue;
    private static int Front = -1;
    private static int Rear = -1;
    private static int size = 0;

    public static void push(int X) {
        queue[++Rear] = X;
        size++;
    }

    public static int pop() {
        if (Front == Rear) {
            return -1;
        } else {
            Front  = Front + 1;
            int value = queue[Front];
            queue[Front] = 0;
            size--;
            return value;
        }
    }

    public static int empty() {
        if(Front == Rear) {
            return 1;
        } else {
            return 0;
        }
    }

    public static int size() {
        return size;
    }

    public static int front() {
        if(empty() == 1) {
            return -1;
        } else {
            return queue[Front + 1];
        }
    }

    public static int back() {
        if(empty() == 1) {
            return -1;
        } else {
            return queue[Rear];
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
                    System.out.println(pop());
                    break;
                case "size":
                    System.out.println(size());
                    break;
                case "empty":
                    System.out.println(empty());
                    break;
                case "front":
                    System.out.println(front());
                    break;
                case "back":
                    System.out.println(back());
            }
        }
    }
}
