import java.util.Scanner;
public class continousnumbers {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the array : ");
        int n = sc.nextInt();

        int[] a = new int[n];

        System.out.print("Enter the elements of the array : ");
        for(int i = 0; i < n; i++){
            a[i] = sc.nextInt();
        }

        System.out.println(arrayelements(a)); 
        
    }

    public static boolean arrayelements(int[] arr) {


        for (int i = 0; i < arr.length - 2; i++) {
            if (   (arr[i]+1 == arr[i+1])     &&    (arr[i+1]+1 == arr[i+2])   ) {
                return true;
            }
        }

        return false;
    }
    
}

