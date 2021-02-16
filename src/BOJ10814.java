import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class BOJ10814 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String[][] people = new String[N][2];
        StringTokenizer st;

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            people[i][0] = st.nextToken();  // 나이
            people[i][1] = st.nextToken();  // 이름
        }

        Arrays.sort(people, new Comparator<String[]>() {
            @Override
            public int compare(String[] o1, String[] o2) {
                return Integer.compare(Integer.parseInt(o1[0]), Integer.parseInt(o2[0]));
            }
        });

        for (int i = 0; i < people.length; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(people[i][j] + " ");
            }
            System.out.println();
        }
    }
}
