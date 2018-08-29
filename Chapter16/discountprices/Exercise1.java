import java.util.Scanner;
public class Exercise1{
  public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);

    double amount;
    double discount;

    System.out.println("Enter amount of purchases:");
    amount = scan.nextDouble();
    discount = amount*0.10;

    System.out.println("Discount price:" + (amount - discount));
  }
}
