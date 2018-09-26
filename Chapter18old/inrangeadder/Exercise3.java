import java.util.Scanner;

public class Exercise3{
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int rangeLow;
    int rangeHigh;
    int totalLow = 0;
    int totalHigh = 0;
    int sum1 = 0;
    int sum2 = 0;
    int data;
    boolean end = true;

    System.out.println("In-range Adder");
    System.out.println("Low end of range:");
    rangeLow = scan.nextInt();
    System.out.println("High end of range");
    rangeHigh = scan.nextInt();

    while (end){
      System.out.println("Enter data:");
      data = scan.nextInt();

      if (data < rangeHigh && data > rangeLow){
        sum1 = sum1 + data;
      }
      else {
        sum2 = sum2 + data;
      }
      if (data == 0){
        System.out.println("Sum of in range values:" + sum1);
        System.out.println("Sum of out of range values:" + sum2);
        end = false
      }
    }
  }
}
