import java.util.Scanner;

public class ATMMachine {
    private static int balance = 10000;
    private static int cashinmachine = 50000;
    private static int pin = 1234;
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Enter PIN: ");
            int enteredpin = scanner.nextInt();

            if (enteredpin == pin) {
                System.out.println("1. Balance Enquiry\n2. Deposit\n3. Withdraw\n4. PIN Change");
                System.out.print("Choose an option: ");
                int choice = scanner.nextInt();

                switch (choice) {
                    case 1:
                        balanceenquiry();
                        break;
                    case 2:
                        deposit();
                        break;
                    case 3:
                        withdraw();
                        break;
                    case 4:
                        changepin();
                        break;
                    default:
                        System.out.println("Invalid option.");
                }
            } else {
                System.out.println("Incorrect PIN.");
            }

            System.out.print("Do you want to continue (yes/no)? ");
            String answer = scanner.next();
            
            if (answer.equalsIgnoreCase("no")) {
                System.exit(0);
            }
            
        }

    }

    private static void balanceenquiry() {
        System.out.println("Your current balance is: Rs." + balance);
    }

    private static void deposit() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter amount to deposit: ");
        int depositamount = scanner.nextInt();

        if (depositamount > 0) {
            balance += depositamount;
            cashinmachine += depositamount;
            System.out.println("Deposit successful. Updated balance: Rs." + balance);
        } else {
            System.out.println("Invalid amount.");
        }
    }

    private static void withdraw() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter amount to withdraw: ");
        int withdrawamount = scanner.nextInt();

        if (withdrawamount > 0 && withdrawamount <= balance && withdrawamount <= cashinmachine) {
            balance -= withdrawamount;
            cashinmachine -= withdrawamount;
            System.out.println("Withdrawal successful. Updated balance: Rs." + balance);
        } else {
            System.out.println("Invalid or insufficient funds.");
        }
    }

    private static void changepin() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter old PIN: ");
        int oldpin = scanner.nextInt();

        if (oldpin == pin) {
            System.out.print("Enter new PIN: ");
            int newpin1 = scanner.nextInt();
            System.out.print("Re-enter new PIN: ");
            int newpin2 = scanner.nextInt();

            if (newpin1 == newpin2) {
                pin = newpin1;
                System.out.println("PIN successfully changed.");
            } else {
                System.out.println("PINs do not match.");
            }
        } else {
            System.out.println("Incorrect old PIN.");
        }
    }
}
