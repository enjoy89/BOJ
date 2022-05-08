import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ2525 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str = br.readLine().split(" ");
        int hour = Integer.parseInt(str[0]);
        int minute = Integer.parseInt(str[1]);

        minute += Integer.parseInt(br.readLine());
        int count;

        if (minute >= 60) {
            count = minute / 60;
            minute %= 60;
            hour += count;
        }
        if (hour >= 24) {
            hour %= 24;
        }
        System.out.println(hour + " " + minute);
    }
}
