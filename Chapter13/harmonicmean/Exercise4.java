import java.util.*;
public class Exercise4 {
  public static void main(String[] args) {
    Scanner scan = new Scanner (System.in);
    float x;
    float y;
    System.out.println("Enter X:");
    x = scan.nextFloat();
    System.out.println("Enter Y:");
    y = scan.nextFloat();
    float arithmeticMean = (x+y)/2;
    float harmonicMean = 2 / ((1/x)+(1/y));
    System.out.println("Arithmetic mean:" + arithmeticMean + "\tHarmonic mean:" + harmonicMean);


  }
}
