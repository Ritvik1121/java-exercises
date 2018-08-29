import java.util.*;
public class Exercise3{
  public static void main(String[] args) {
    Scanner scan = new Scanner (System.in);
    double x_input;
    System.out.println("Enter a double:");
    x_input = scan.nextDouble();
    System.out.println("Base 2 log of" + x_input + "is" + (Math.log(x_input))*(Math.log(2)));
  }
}
