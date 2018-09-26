import java.util.Scanner;

public class Exercise2{
  public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);
    int n;
    int sum = 0;
    int nsqr;

    System.out.println("Enter value of n");
    n = scan.nextInt();

    for (int i = 1; i <= n; i = i + 2){
      sum = sum + i;
    }
    nsqr = n * n;
    System.out.println("Sum of odd integers:" + sum);
    System.out.println("N sqaured:" + nsqr);
  }
}
