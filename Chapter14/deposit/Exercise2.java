import java.util.*;
import java.lang.Math;
public class Exercise2{
  public static void main(String[] args) {
    Scanner scan = new Scanner (System.in);
    double principle;
    double rate;
    double number;
    double time;

    System.out.println("Initial deposit");
    principle = scan.nextDouble();
    System.out.println("Interest rate:");
    rate = scan.nextDouble();
    System.out.println("Times per year:");
    number = scan.nextDouble();
    System.out.println("Number of years:");
    time = scan.nextDouble();

    double partOne = ((rate/number)+1);
    double partTwo = number*time;
    
    System.out.println("Value:"+ principle*(Math.pow(partOne, partTwo)));
  }
}
