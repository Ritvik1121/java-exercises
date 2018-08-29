import java.util.*;
public class Exercise4{
  public static void main(String[] args) {
    Scanner scan = new Scanner (System.in);
    double voltage;
    double resistance;
    System.out.println("Enter voltage:");
    voltage = scan.nextDouble();
    System.out.println("Enter resistance:");
    resistance = scan.nextDouble();
    System.out.println("Current:" + (voltage + 0.0)/resistance);

  }
}
