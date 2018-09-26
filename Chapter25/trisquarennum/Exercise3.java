import java.util.Scanner;

public class Exercise3{
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int limit;
    int square;
    int triangle;

    System.out.println("Enter upper limit:");
    limit = scan.nextInt();

    for (int i = 0; i < limit; i++){
      square = i * i;
      triangle = 0;
      for (int j = 1; j <= limit; j++){
        triangle += j;
        if (square == triangle){
          System.out.println( "The square of " + i + "and the triangle of " + j);
        }
      }
    }
  }
}
