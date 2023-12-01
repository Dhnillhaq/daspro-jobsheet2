public class DeretDescending {
    public static void main(String[] args) {
        descendingIt(5);
        descending(5);
    }

    static void descendingIt(int f) {
        for (int i = f; i >= 0; i--) {
            System.out.print(i + " ");
        }
    }

    static void descending(int n) {
        if (n == 0) {
            System.out.print(0);
        } else {
            System.out.print(n + " ");
            descending(n - 1);
        }
    }
}