import java.util.Scanner;

public class Exercise1{
  public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);
    int count;
    int input;
    int total = 0;

    System.out.println("How many integers will be added:");
    count = scan.nextInt();

    while (count > 0){
      System.out.println("Enter an integer:");
      input = scan.nextInt();
      total = total + input;
        count--;

    }
    System.out.println("The sum is:" + total);

  }
}
