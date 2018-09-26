import java.util.Scanner;

public class Exercise2{
  public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);
    double milesInt;
    double milesFin;
    double dif;
    double gallons;
    double mpg;
    boolean end = true;

    System.out.println("Inital miles:");
    milesInt = scan.nextDouble();

    if ( milesInt < 0){
      System.out.println("bye");
      end = false;
    }

    while (end){
      System.out.println("Final miles:");
      milesFin = scan.nextDouble();
      System.out.println("Gallons:");
      gallons = scan.nextDouble();

      dif = milesFin - milesInt;
      mpg = dif/gallons;
      System.out.println("Miles per Gallon:" + mpg);
      System.out.println("Inital miles:");
      milesInt = scan.nextDouble();
      if ( milesInt < 0){
        System.out.println("bye");
        end = false;
      }
    }
  }
}
