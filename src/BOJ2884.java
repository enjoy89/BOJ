import java.util.Scanner;

public class BOJ2884 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int H = input.nextInt();
        int M = input.nextInt();
        int M2 = M - 45;

        if (M2 < 0) {
            H--;
            if (H < 0) {
                H += 24;
            }
            M = 60 + M2;
            System.out.println(H + " " + M);
        } else {
            System.out.println(H + " " + M2);
        }
    }
}

