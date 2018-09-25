import java.util.Scanner;

public class Exercise1{
  public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);
    int sum;

    System.out.println("Enter first integer");
    int num = scan.nextInt();

    if (num == 0){
      System.out.println("No integers were entered");
      System.out.println("bye");

    }
    else{
      System.out.println("Enter an integer");
      int num2 = scan.nextInt();
      System.out.println("Enter an integer");
      int num3 = scan.nextInt();

      sum = num + num2 + num3;
      System.out.println("Sum of integers:" + sum);
      System.out.println("bye");
    }

  }
}
