import java.util.Scanner;

public class Exercise1{
  public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);
    int checking;
    int savings;

    System.out.println("Enter amount in checking account:");
    checking = scan.nextInt();
    System.out.println("Enter amount in savings account:" );
    savings = scan.nextInt();

    if (checking < 1000){
      System.out.println("Service charge of $0.15 per check");
    }

    else if (savings < 1500){
      System.out.println("Service charge of $0.15 per check");
    }

    else {
      System.out.println("No service charge.");

    }
  }
}
