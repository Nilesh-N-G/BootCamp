import java.util.Scanner;

public class BusTicketVendingMachine {
    private static int ticketssold = 0;
    private static int amountcollected = 0;
    private static int pin = 1234;
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Enter PIN : ");
            int enteredpin = scanner.nextInt();

            if (enteredpin == pin) {
                System.out.println("1. Ticket Issue\n2. Balance Collected\n3. Number of Tickets Sold\n4. PIN Change");
                System.out.print("Choose an option : ");
                int choice = scanner.nextInt();

                switch (choice) {
                    case 1:
                        issueticket();
                        break;
                    case 2:
                        balancecollected();
                        break;
                    case 3:
                        ticketssold();
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

    private static void issueticket() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter ticket price : ");
        int ticketprice = scanner.nextInt();
        int discount = 0;


        if (ticketprice > 1000) {
            discount = (int) (ticketprice * 0.20);
        }else if (ticketprice > 750) {
            discount = (int) (ticketprice * 0.15);
        }else if (ticketprice > 500) {
            discount = (int) (ticketprice * 0.10);
        }else {
            discount = 0;
        }

        int finalprice = ticketprice - discount;
        ticketssold++;
        amountcollected += finalprice;
        System.out.println("Ticket issued Price after discount : Rs." + finalprice);
    }

    private static void balancecollected() {
        System.out.println("Total amount collected : Rs." + amountcollected);
    }

    private static void ticketssold() {
        System.out.println("Total tickets sold : " + ticketssold);
    }

    private static void changepin() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter old PIN : ");
        int oldpin = scanner.nextInt();

        if (oldpin == pin) {
            System.out.print("Enter new PIN : ");
            int newpin1 = scanner.nextInt();
            System.out.print("Re-enter new PIN : ");
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
