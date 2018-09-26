import java.util.Scanner;

public class Exercise4{
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int n;
    boolean squareSum = false;

    int o;

    System.out.println("Enter value for n");
    n = scan.nextInt();

    for (int i = 1; i * i <= n; i++){
      for(int j = 1; j * j <= n; j++){
        if (i * i + j * j == n){
          squareSum = true;
        }

      }
    }
    if (squareSum){
      System.out.println("yes");

    }
    else {
      System.out.println("No");

    }
  }
}
