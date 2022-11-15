public class p43 {
    public static void main(String[] args) {
        int n = 5;
        int x = 1;

        for (int i = 1; i <= n; i++) {
            x = i - 1;
            for (int j = 1; j <= i; j++) {
                System.out.print(x + i + " ");
                x += 2;
            }
            System.out.println();
        }
    }
}
