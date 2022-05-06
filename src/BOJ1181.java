import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class BOJ1181 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        HashSet<String> set = new HashSet<>();  // 단어의 중복을 제거하기 위해 HashSet 이용

        for (int i = 0; i < N; i++) {
            set.add(br.readLine());
        }

        ArrayList<String> list = new ArrayList<>(set);  // ArrayList로 변환

        // 리스트를 조건에 따라 정렬한다.
        // 단어의 길이가 같을 경우 사전 순으로 정렬한다.
        // 단어의 길이가 다를 경우 길이가 짧은 것부터 정렬한다.
        Collections.sort(list, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if (o1.length() == o2.length()) {
                    return o1.compareTo(o2);
                } else {
                    return Integer.compare(o1.length(), o2.length());
                }
            }
        });

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
