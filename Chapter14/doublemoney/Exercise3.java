import java.util.*;
public class Exercise3{
  public static void main(String[] args) {
    Scanner scan = new Scanner (System.in);
    Double rate;

    System.out.println("Enter interest rate:");
    
    rate = scan.nextDouble();

    System.out.println("Number of years:"+ (72/rate));


  }
}
