import java.util.Scanner;

public class BOJ10950 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        int num1 = 0;
        int num2 = 0;

        for (int i = 0; i < t; i++) {
            num1 = input.nextInt();
            num2 = input.nextInt();
            if (num1 <= 0 || num2 >= 10) {
                System.out.println("잘못된 입력값임");
                return;
            }
            System.out.println(num1 + num2);
        }
    }
}
