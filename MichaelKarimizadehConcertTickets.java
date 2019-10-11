import java.util.Scanner;
import java.text.*;

public class MichaelKarimizadehConcertTickets
{
  public static void main(String[] args)
  {
    double platPrice = 150.00;
    int platTicks;
    double goldPrice = 120.50;
    int goldTicks;
    double redPrice = 80.75;
    int redTicks;
    double greenPrice = 50.25;
    int greenTicks;
    int totalTicks;
    double service = 12.50;
    String name;
    double sub;
    double hst;
    double serviceFees;
    double total;
    int paymentMethod;
    long sixteenDigitNum;
    int expiryDate;
    DecimalFormat df = new DecimalFormat("###.00");
    DecimalFormat df2 = new DecimalFormat("$###,###.00");
    Scanner sc = new Scanner(System.in);
    Scanner sc2 = new Scanner(System.in);
    System.out.printf("%30s %n","JAY Z AND BEYONCÉ:");
    System.out.printf("%28s %n %n","On the Run Tour");
    System.out.printf("%-7s %28s %n","SECTION","PRICE");
    System.out.printf("%-8s %27s %n","Platinum",df.format(platPrice));
    System.out.printf("%-4s %31s %n","Gold",df.format(goldPrice));
    System.out.printf("%-3s %32s %n","Red",df.format(redPrice));
    System.out.printf("%-5s %30s %n","Green",df.format(greenPrice));
    System.out.println("-------------------------------------");
    System.out.printf("%-35s","Enter number of platinum tickets:");
    platTicks = sc.nextInt();
    System.out.printf("%-35s","Enter number of gold tickets:");
    goldTicks = sc.nextInt();
    System.out.printf("%-35s","Enter number of red tickets:");
    redTicks = sc.nextInt();
    System.out.printf("%-35s","Enter number of green tickets:");
    greenTicks = sc.nextInt();
    System.out.println("-------------------------------------");
    totalTicks=platTicks+goldTicks+redTicks+greenTicks;
    sub = platPrice*platTicks+goldPrice*goldTicks+redPrice*redTicks+greenPrice*greenTicks;
    hst = Math.round((sub*0.13)*100)/100.0;
    serviceFees = totalTicks*service;
    total = sub+hst+serviceFees;
    System.out.printf("%-9s %26s %n","SUBTOTAL:", df2.format(sub));
    System.out.printf("%-4s %31s %n","HST:", hst);
    System.out.printf("%-13s %22s %n","SERVICE FEES:", df.format(serviceFees));
    System.out.printf("%-6s %29s %n","TOTAL:", df2.format(total));
    System.out.println("-------------------------------------\n");
    System.out.println("How will you be paying?\n");
    System.out.println("1 - VISA");
    System.out.println("2 - MasterCard");
    System.out.println("3 - American Express\n");
    System.out.printf("%-35s","Enter the payment method:");
    paymentMethod = sc.nextInt();
    System.out.printf("%-36s","\nEnter your name:");
    name = sc2.nextLine();
    System.out.printf("%-35s","Enter the 16-digit number:");
    sixteenDigitNum = sc.nextLong();
    System.out.printf("%-35s","Enter the expity date (mmyyyy)");
    expiryDate = sc.nextInt();
    System.out.print("\nThank you "+name+"! Your order has been processed!");
  }
}