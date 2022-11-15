public class p39 {
    public static void main(String[] args) {
        int n = 5;
        int x;

        for (int i = n; i >= 1; i--) {
            x = n;
            for (int j = 5; j >= i; j--) {
                System.out.print(x-- + " ");
            }
            System.out.println();
        }
    }
}
