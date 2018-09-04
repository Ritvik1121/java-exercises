import java.util.Scanner;

public class Exercise4 {
  public static void main(String[] args) {

    int weight;
    int targetWeight = 250;
    int targetMin = 220;
    int targetMax = 280;

    Scanner scan = new Scanner(System.in);

    System.out.println("Enter Weight:");
    weight = scan.nextInt();

    if (weight == targetWeight)
      System.out.println("You're allowed to particpate");

    else if (weight < targetWeight && weight >= targetMin)
      System.out.println("You're allowed to particpate");

    else if (weight > targetWeight && weight <= targetMax)
      System.out.println("You're allowed to particpate");

    else
    System.out.println("You're not allowed to particpate");


  }


}
