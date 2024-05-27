public class LargestPrime {
    public static boolean isPrime(int n) {
        if (n <= 1){
            return false;
        }
        for (int i = 2; i <n; i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    public static int largestPrime(int start, int end) {
        int largest = -1;
        for (int i = end; i >= start; i--) {
            if (isPrime(i)) {
                largest = i;
                break;
            }
        }
        return largest;
    }

    public static void main(String[] args) {
        System.out.println(largestPrime(1, 20));     
        System.out.println(largestPrime(15, 36));  
        System.out.println(largestPrime(245, 345)); 
    }
}
