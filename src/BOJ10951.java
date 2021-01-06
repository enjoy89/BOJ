import java.util.Scanner;

public class BOJ10951 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num1, num2;
        while (input.hasNextInt()) {
            num1 = input.nextInt();
            num2 = input.nextInt();
            System.out.println(num1 + num2);
        }
    }
}
