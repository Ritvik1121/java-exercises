import java.util.Scanner;

public class Exercise2{
  public static void main(String[] args) {

    int bolt;
    int nuts;
    int washers;

    Scanner scan = new Scanner(System.in);
    
    System.out.println("Number of bolt:");
    bolt = scan.nextInt();
    System.out.println("Number of nuts:");
    nuts = scan.nextInt();
    System.out.println("Number of washers:");
    washers = scan.nextInt();

    if (nuts < bolt)
      System.out.println("Check the order: too few nuts");
    else if (washers != (bolt*2))
      System.out.println("Check the order: too few washers");

    System.out.println("Total cost:" + ((5*bolt) + (3*nuts) + (1*washers)));

  }
}
