import java.util.Scanner;

public class Exercise2{
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    double total = 1;
    int n;

    System.out.println("Number of people at party:");
    n = scan.nextInt();

    for (int i = 1; i < n; i++){
      total = total * ((365.0 - i)/365.0);
    }
    System.out.println("Probability" + (total * 100));
  }
}
