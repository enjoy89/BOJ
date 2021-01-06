import java.util.Scanner;

public class BOJ14681 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n1 = input.nextInt();
        int n2 = input.nextInt();

        if (n1 > 0 && n2 > 0) {
            System.out.println("1");
        } else if (n1 > 0 && n2 < 0) {
            System.out.println("4");
        } else if (n1 < 0 && n2 > 0) {
            System.out.println("2");
        } else {
            System.out.println("3");
        }
    }
}
