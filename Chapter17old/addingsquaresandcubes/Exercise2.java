import java.util.Scanner;

public class Exercise2{
  public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);
    int upperLimit;
    double squareTotal = 0;
    double cubeTotal = 0;

    System.out.println("Enter upper limit");
    upperLimit = scan.nextInt();

    while (upperLimit > 0 ){
      squareTotal += (upperLimit * upperLimit);
      cubeTotal += (upperLimit * upperLimit * upperLimit);
      upperLimit = upperLimit - 1;


    }

    System.out.println("The sum of squares:" + squareTotal);
    System.out.println("The sum of cubes:" + cubeTotal);


  }
}
