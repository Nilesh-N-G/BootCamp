import java.util.Scanner;

public class problem1{
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);


        System.out.print("ENTER THE SERVICE NUMBER : ");
        String serviceno = sc.nextLine();
        

        System.out.print("ENTER PREVIOUS READING : ");
        int previousreading = sc.nextInt();



        System.out.print("ENTER CURRENT READING : ");
        int currentreading = sc.nextInt();



        int units= currentreading - previousreading;

        double cost;
        if (units < 100) {
            cost = units* 1;
        } else if (units < 150) {
            cost = units * 1.5;
        } else if (units < 200) {
            cost = units * 2;
        } else {
            cost = units * 2.5;
        }

        double cgst = cost * 0.05;
        double sgst = cost * 0.15;
        double totalamount = cost + cgst + sgst;

        System.out.println("SERVICE NO : " + serviceno);
        System.out.println("PREVIOUS READING : " + previousreading);
        System.out.println("CURRENT READING : " + currentreading);
        System.out.println("UNITS CONSUMED : " + units);
        System.out.println("COST PER UNIT : " + cost/units+" RUPEES");
        System.out.println("CGST (5%) : " + cgst + " RUPEES");
        System.out.println("SGST (15%) : " + sgst + " RUPEES");
        System.out.println("AMOUNT TO PAY : " + totalamount + " RUPEES");
    }
}
