import java.util.Scanner;
import java.text.*;
  
public class MichaelKarimizadehVariablesAndArithmeticOperators
{
  public static void main(String[] args)
  {
    //Q1
    /*
    String date;
    String name;
    String phone;
    String itemOneName;
    int itemOneQuan;
    double itemOnePrice;
    String itemTwoName;
    int itemTwoQuan;
    double itemTwoPrice;
    double sub;
    double hst;
    double total;
    Scanner sc = new Scanner(System.in);
    DecimalFormat x = new DecimalFormat("$##.##");
    System.out.println("Enter the date:");
    date = sc.nextLine();
    System.out.println("Enter your name:");
    name = sc.nextLine();
    System.out.println("Enter your phone number:");
    phone = sc.nextLine();
    System.out.println("Enter the name of your first item:");
    itemOneName = sc.nextLine();
    System.out.println("Enter the quantity of your first item:");
    itemOneQuan = sc.nextInt();
    System.out.println("Enter the price of your first item:");
    itemOnePrice = sc.nextDouble();
    System.out.println("Enter the name of your second item:");
    itemTwoName = ("ASUS 24\" LED Monitor");
    System.out.println("Enter the quantity of your second item:");
    itemTwoQuan = sc.nextInt();
    System.out.println("Enter the price of your second item:");
    itemTwoPrice = sc.nextDouble();
    sub = itemOnePrice*itemOneQuan+itemTwoPrice*itemTwoQuan;
    hst = sub*0.13;
    total = hst+sub;
    System.out.format("%35s %n","CANADA COMPUTERS INC.");
    System.out.format("%37s %n","-------------------------");
    System.out.format("%17s %17s %n","Date:",date);
    System.out.format("%17s %14s %n","Name:",name);
    System.out.format("%18s %15s %n %n","Phone:",phone);
    System.out.format("%3s %11s %32s %n","Qty","Item","Price");
    System.out.println("-------------------------------------------------");
    System.out.format("%2s %34s %10s %n",itemOneQuan,itemOneName,x.format(itemOnePrice));
    System.out.format("%2s %28s %16s %n",itemTwoQuan,itemTwoName,x.format(itemTwoPrice));
    System.out.println("-------------------------------------------------");
    System.out.format("%19s %28s %n","SUBTOTAL:",x.format(sub));
    System.out.format("%14s %32s %n","HST:",x.format(hst));
    System.out.format("%22s %25s","GRAND TOTAL:",x.format(total));
    */

    //Q2
    /*
    DecimalFormat x = new DecimalFormat ("$#.##");
    double changeDue = 1.86;
    int change = (int)(Math.ceil(changeDue*100));
    int tNum = Math.round((int)change/200);
    change = change%200;
    int lNum = Math.round((int)change/100);
    change = change%100;
    int qNum = Math.round((int)change/25);
    change = change%25;
    int dNum = Math.round((int)change/10);
    change = change%10;
    int nNum = Math.round((int)change/5);
    change = change%5;
    int pNum = Math.round((int)change/1);
    System.out.format("%1s %9s %n %n","Amount of Change:",x.format(changeDue));
    System.out.format("%1s %16s %n","Toonies:",tNum);
    System.out.format("%1s %16s %n","Loonies:",lNum);
    System.out.format("%1s %15s %n","Quarters:",qNum);
    System.out.format("%1s %18s %n","Dimes:",dNum);
    System.out.format("%1s %16s %n","Nickels:",nNum);
    System.out.format("%1s %16s %n","Pennies:",pNum);
    */
  }
}