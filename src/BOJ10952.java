import java.util.Scanner;

public class BOJ10952 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while (true) {
            int n1 = input.nextInt();
            int n2 = input.nextInt();
            if (n1 == 0 && n2 == 0) {
                break;
            }
            System.out.println(n1 + n2);
        }
    }
}
