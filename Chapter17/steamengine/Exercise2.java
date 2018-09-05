import java.util.Scanner;

public class Exercise2{
  public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);
    float tair;
    float tsteam;

    System.out.println("Enter air temperature:");
    tair = scan.nextFloat();
    System.out.println("Enter steam temperature:");
    tsteam = scan.nextFloat();

    if (tsteam < 373) {
      System.out.println("Steam engine efficiency: 0");

    }

    else if (tsteam >373) {
      System.out.println("Steam engine efficiency:" + (1 - (tair/tsteam)));

    }


  }
}
