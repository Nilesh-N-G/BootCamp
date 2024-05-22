import java.util.Scanner;

public class problem3{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int accountbalance = 10000;
        int atmpin = 1234;
        int cashinatm = 8000;
        
        System.out.print("ENTER ATM PIN : ");
        int enteredpin = scanner.nextInt();
        
        if (enteredpin != atmpin) {
            System.out.println("INCORRECT PIN....");
        } else {
            System.out.print("ENTER THE AMOUNT TO WITHDRAW: ");
            int amount = scanner.nextInt();
            
            if (amount % 100 != 0) {
                System.out.println("INVALID AMOUNT... MUST BE MULTIPLE OF 100.");
            } else if (amount > accountbalance) {
                System.out.println("INSUFFICIENT BALANCE....");
            } else if (amount > cashinatm) {
                System.out.println("INSUFFICIENT CASH IN ATM....");
            } else {
                accountbalance = accountbalance - amount;
                cashinatm = cashinatm-amount;
                System.out.println("TRANSACTION SUCCESSFULL.... \nAVAILABLE BALANCE : " + accountbalance);
            }
        }
        
    }
}
