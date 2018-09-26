import java.util.Scanner;

public class Exercise3{
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int n;
    int count;
    float total = 0;
    float data;
    float avg = 0;

    System.out.println("How many numbers:");
    n = scan.nextInt();

    while (n > 0){
      System.out.println("Enter floating point number");
      data = scan.nextFloat();
      total = total + data;
      avg = avg + (data * data);
      n = n -1;
      count = count + 1
    }
  }
}
