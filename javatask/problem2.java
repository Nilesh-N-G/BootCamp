import java.util.Scanner;

public class problem2{
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);


        System.out.print("ENTER THE NUMBER OF BOARDING STOPS : ");
        int boardingstops = sc.nextInt();
        

        System.out.print("ENTER NUMBER OF DESTINATION STOPS : ");
        int destinationstops = sc.nextInt();



        System.out.print("ENTER NUMBER OF ADULT PASSENGERS : ");
        int adultpassengers = sc.nextInt();


        System.out.print("ENTER NUMBER OF CHILDREN PASSENGERS : ");
        int childpassengers = sc.nextInt();


        int numberofstops = destinationstops - boardingstops;

        int costforadult = 10;
        int costforchild = 5;
        int totaladultcost = costforadult * adultpassengers * numberofstops;
        int totalchildcost = costforchild * childpassengers * numberofstops;
        int totalcost = totaladultcost + totalchildcost;

        double discount = 0;
        
        if (adultpassengers >= 5) {
            discount = 0.20 * totalcost;
        } else if (adultpassengers == 4) {
            discount = 0.15 * totalcost;
        } else if (adultpassengers == 3) {
            discount = 0.10 * totalcost;
        } else if (adultpassengers == 2) {
            discount = 0.05 * totalcost;
        }
        
        double totalcostwithdiscount = totalcost - discount;

        double tax = 0.10 * totalcostwithdiscount;
        double totalPriceIncludingTax = totalcostwithdiscount + tax;

        System.out.println("BOARDING STOPS : " + boardingstops);
        System.out.println("DESTINATION STOPS : " + destinationstops);
        System.out.println("NUMBER OF ADULT PASSENGERS : " + adultpassengers);
        System.out.println("NUMBER OF CHILD PASSENGERS : " + childpassengers);
        System.out.println("NUMBER OF STOPS TRAVELLED : " + numberofstops);
        System.out.println("COST OF ADULT PASSENGERS : Rs." + totaladultcost);
        System.out.println("COST OF CHILDREN PASSENGERS : Rs." + totalchildcost);
        System.out.println("TOTAL COST OF TICKET WITHOUT DISCOUNT : Rs." + totalcost);
        System.out.println("DISCOUNT ON THE TICKET : " + ((discount/totalcost)*100)+"%");
        System.out.println("TOTAL COST OF TICKET WITH DISCOUNT (WITHOUT TAX) : Rs." + totalcostwithdiscount);
        System.out.println("TAX (10%) : Rs." + tax);
        System.out.println("TOTAL PRICE OF TICKET (INCLUDING TAX) : Rs." + totalPriceIncludingTax);



   
    }
}