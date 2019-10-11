import java.util.Scanner;

public class MichaelKarimizadehDice{
  public static void main(String[] args){
    int uDice1;
    int uDice2;
    int uRoll;
    int cDice1;
    int cDice2;
    int cRoll;
    int points=500;
    int input;
    String reRoll;
    String pAgain;
    Scanner sc=new Scanner(System.in);
    System.out.println("\t\tDICE GAME\n");
    System.out.println("You have "+points+" points.");
    System.out.print("Enter points to wager (-1 to QUIT):\t");
    input=sc.nextInt();
    while(input!=-1){
      if(input>points){
        System.out.println("\nPlease enter a wager less than or equal to "+points+"!");
      }
      else if(input<=0){
        System.out.println("\nYou must wager at least one (1) point!");
      }
      else{
      uDice1=(int)(Math.random()*6+1);
      uDice2=(int)(Math.random()*6+1);
      cDice1=(int)(Math.random()*6+1);
      cDice2=(int)(Math.random()*6+1);
      System.out.println("\nYou rolled a ["+uDice1+"] ["+uDice2+"]");
      System.out.println("Computer rolled a ["+cDice1+"] ["+cDice2+"]\n");
      uRoll=uDice1+uDice2;
      cRoll=cDice1+cDice2;
      while(uRoll==cRoll){
        System.out.println("It's a tie!");
        System.out.print("Enter 'R' to roll again:\t\t");
        reRoll=sc.next();
        if (reRoll.charAt(0)=='R'){
          uDice1=(int)(Math.random()*6+1);
          uDice2=(int)(Math.random()*6+1);
          cDice1=(int)(Math.random()*6+1);
          cDice2=(int)(Math.random()*6+1);
          System.out.println("You rolled a ["+uDice1+"] ["+uDice2+"]");
          System.out.println("Computer rolled a ["+cDice1+"] ["+cDice2+"]\n");
          uRoll=uDice1+uDice2;
          cRoll=cDice1+cDice2;
        }
      }
      if (uRoll>cRoll){
        points+=input;
        System.out.println("You win "+input+" points!");
      }
      else if (uRoll<cRoll){
        points-=input;
        System.out.println("You lose "+input+" points!");
      }
      }
      if (points<=0){
        System.out.println("\nGAME OVER! You have zero points left!\n");
        System.out.print("Would you like to play again (Y or N)?\t");
        pAgain=sc.next();
        if (pAgain.charAt(0)=='Y'){
          points=500;
        }
        else if (pAgain.charAt(0)=='N'){
          input=-1;
          break;
        }
      }
      System.out.println("\nYou have "+points+" points.");
      System.out.print("Enter points to wager (-1 to QUIT):\t");
      input=sc.nextInt();
    }
    System.out.print("\nThank you for playing! Goodbye!");
  }
}