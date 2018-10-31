import java.util.Scanner;
public class PantryTester{
  public static void main ( String[] args ){
    Scanner scan = new Scanner(System.in);
    int choice;
    int spreadAmount;
    boolean end = false;


    Jam goose = new Jam( "Gooseberry", "7/4/86", 12 );
    Jam apple = new Jam( "Crab Apple", "9/30/99", 8 );
    Jam rhub  = new Jam( "Rhubarb", "10/31/99", 3 );

    Pantry hubbard = new Pantry( goose, apple, rhub );

    System.out.println("Welcome to Mother Hubbard's Pantry!");
    System.out.println(" ");

    while (!end){
      System.out.println("The jams are:");
      System.out.println( hubbard );

      System.out.println("Enter your selection (1, 2, 3)");
      choice = scan.nextInt();

      if (choice < 0){
        end = true;
      }else if (choice == 1){
        hubbard.select(1);
      } else if (choice == 2){
        hubbard.select(2);
      } else if (choice == 3){
        hubbard.select(3);
      }

      System.out.println("Enter amount to spread:");
      spreadAmount = scan.nextInt();

      hubbard.spread(spreadAmount);
    }

    //hubbard.select(1);
    //hubbard.spread(2);
    //System.out.println( hubbard );

    //hubbard.select(3);
    //hubbard.spread(4);
    //System.out.println( hubbard );
  }
}
