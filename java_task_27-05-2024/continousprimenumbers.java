import java.util.Scanner;
public class continousprimenumbers {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the array : ");
        int n = sc.nextInt();

        int[] a = new int[n];

        System.out.print("Enter the elements of the array : ");
        for(int i = 0; i < n; i++){
            a[i] = sc.nextInt();
        }

        System.out.println(continuousprimes(a)); 
        
    }


    public static boolean continuousprimes(int[] a) {
        for (int i = 0; i < a.length - 2; i++) {
            if (isPrime(a[i]) && isPrime(a[i + 1]) && isPrime(a[i + 2])) {
                return true;
            }
        }
        return false;
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






