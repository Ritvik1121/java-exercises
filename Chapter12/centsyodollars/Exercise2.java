import java.util.*;
public class Exercise2{
  public static void main(String[] args) {
    Scanner scan = new Scanner (System.in);
    int cents;
    int dollar = 100;
    System.out.println("Input the cents:");
    cents = scan.nextInt();
    System.out.println("That is:"+ cents/dollar + "dollars" + cents%dollar + "cents");
  }
}
