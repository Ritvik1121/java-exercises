import java.util.Scanner;

public class Exercise7{
  public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);
    long n = 0;
    long r = 0;
    long temp = 0;
    long total = 1;
    long total2 = 1;

    System.out.println("Enter value for n:");
    n = scan.nextLong();
    System.out.println("Enter value for r");
    r = scan.nextLong();

    if(n <=0 || r <= 0){
      System.out.println("N and R must be equal to or greater than 0");
    }
    else if ( r > n){
      System.out.println("R must be less than or equal to N");

    }
    else{
      temp = n;
      while (temp > 0){
        total = temp * total;
        temp -= 1;
      }
      temp = n - r;
      while (temp > 0){
        total2 = total2 * temp;
        temp -= 1;
      }
      System.out.println("Answer is:" + (total/total2));

    }

  }
}
