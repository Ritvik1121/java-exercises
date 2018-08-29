import java.util.*;
public class Exercise3{
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int change;
    System.out.println("enter amount of change");
    change = scan.nextInt();

    int dollarAmount = change/100;

    int cents = change - (dollarAmount*100);

    int quarterAmount = cents/25;
    cents = cents - (quarterAmount*25);

    int dimeAmount = cents/10;
    cents = cents - (dimeAmount*10);

    int nickelAmount = cents/5;
    cents = cents - (nickelAmount*5);

    int pennies = cents;

    System.out.println("Your change is:" + dollarAmount + "dollars," + quarterAmount + "quarters," + dimeAmount + "dimes," + nickelAmount + "nickels, and" + pennies + "pennies");


  }


}
