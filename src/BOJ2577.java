import java.util.Scanner;

public class BOJ2577 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String ABC = String.valueOf(input.nextInt() * input.nextInt() * input.nextInt());
        int[] arr = new int[10];

        for(int i=0; i<arr.length; i++) {
            int count = 0;
            for(int j=0; j<ABC.length(); j++) {
                if((ABC.charAt(j) - '0') == i) {
                    count++;
                }
            }
            System.out.println(count);
        }
    }
}

