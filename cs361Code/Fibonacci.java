public class Fibonacci {
    public static int fibonacci(int n) {
        if (n < 0 || n > 45) {
            throw new IllegalArgumentException("n should be between 0 and 45");
        } else {
            if (n == 0 || n == 1) {
                return 1;
            } else {
                return fibonacci(n - 1) + fibonacci(n - 2);
            }
        }
    }

    public static void main(String[] args) {
        for (int i = 0; i <= 100; i++) {
            System.out.println("Fibonacci(" + i + ") = " + fibonacci(i));
        }
    }
}
