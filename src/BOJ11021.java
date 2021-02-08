import java.util.Scanner;

public class BOJ11021 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int result = 0;

        for (int i = 0; i < n; i++) {
            int num1 = input.nextInt();
            int num2 = input.nextInt();
            result = num1 + num2;
            System.out.println("Case #" + (i + 1) + ": " + num1 + " + " + num2 + " = " + result);
        }

    }
}