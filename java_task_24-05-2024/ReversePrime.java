public class ReversePrime {
    public static boolean isPrime(int n) {
        if (n <= 1){
            return false;
        }
        for (int i = 2; i < n; i++) {
            if (n % i == 0){
                return false;
            }
        }
        return true;
    }

    public static boolean reversePrime(int n) {
        if (!isPrime(n)) return false;
        int reversed = Integer.parseInt(new StringBuilder(Integer.toString(n)).reverse().toString());
        return isPrime(reversed);
    }

    public static void main(String[] args) {
        System.out.println(reversePrime(13)); 
        System.out.println(reversePrime(23)); 
        System.out.println(reversePrime(16));
        System.out.println(reversePrime(79)); 
    }
}
