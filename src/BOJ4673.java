public class BOJ4673 {
    public static int d(int n) {
        int temp = 0;
        String[] nums = String.valueOf(n).split("");
        for (String num : nums) {
            temp += Integer.parseInt(num);
        }
        return n + temp;
    }

    public static void main(String[] args) {
        boolean[] check = new boolean[10001];
        for (int i = 1; i < check.length; i++) {
            int n = d(i);
            if (n < 10001) {
                check[n] = true;
            }
        }

        for (int i = 1; i <check.length; i++) {
            if (!check[i]) {
                System.out.println(i);
            }
        }
    }
}
