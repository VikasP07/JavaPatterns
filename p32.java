
public class p32 {
    public static void main(String[] args) {
        int n = 5;
        int x;
        for (int i = 1; i <= n; i++) {
            x = i - 1;
            for (int j = 1; j <= n; j++) {
                x += n;
                System.out.print((char) (x - n + 65) + " ");
            }
            System.out.println();
        }
    }
}
