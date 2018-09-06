import java.util.Scanner;

public class Exercise4{
  public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);
    int strength;
    int health;
    int luck;

    System.out.println("Welcome to Yertle's Quest");

    System.out.println("Enter strength(1-10):");
    strength = scan.nextInt();
    System.out.println("Enter health(1-10):");
    health = scan.nextInt();
    System.out.println("Enter luck(1-10):");
    luck = scan.nextInt();

    if ((strength + health + luck) > 15){
      System.out.println("You have given your character too many point! Default values have been assigned");
      System.out.println("strength: 5, health: 5, luck: 5");

    }

    else if ((strength + health + luck) < 15){
      System.out.println("strength:" + strength + " health:" + health + "luck:" + luck);

    }


  }
}
