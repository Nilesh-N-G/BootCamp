public class prime {

    public static void main(String[] args) {
        int a[] = { 10, 20, 11, 20, 13 };

        for (int i = 0; i < a.length; i++) {

            System.out.println(a[i] + " " + isPrime(a[i]));

        }
    }

    public static boolean isPrime(int n) {
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

}
