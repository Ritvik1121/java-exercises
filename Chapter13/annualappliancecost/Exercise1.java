import java.util.*;
public class Exercise1{
  public static void main(String[] args) {
    Scanner scan = new Scanner (System.in);
    double price;
    double hours;

    System.out.println("Enter cost per kilowatt-hour in cents ");
    price = scan.nextDouble();

    System.out.println("Enter kilowatt-hours used per year");
    hours = scan.nextDouble();
    
    System.out.println((price*hours)/100;

  }

}
