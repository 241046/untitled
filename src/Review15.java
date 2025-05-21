public class Review15 {
    public static void main(String[] args) {
        String A = new java.util.Scanner(System.in).nextLine();
        try {
            int num = Integer.parseInt(A);
            if (num % 2 == 0) {
                System.out.println("偶数");
            } else if (num % 2 == 1) {
                System.out.println("奇数");
            }
        } catch (NumberFormatException e) {
            System.out.println("無効な入力です。");

        }
    }
}
