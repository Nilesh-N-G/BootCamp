public class addprime {

    public static void main(String[] args) {
        int a[] = { 10, 20, 11, 20, 13, 23, 3, 29 };

        for (int i = 0; i < a.length; i++) {
            int sum = 0;
            int num = a[i];
            while (num != 0) {
                sum += num % 10;
                num /= 10;
            }

            System.out.println(a[i] + " " + (isPrime(a[i]) && isPrime(sum)));

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
