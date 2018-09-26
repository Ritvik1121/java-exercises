import java.util.Scanner;

public class Exercise6{
  public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);
    String username = new String ("holder");
    String password = new String ("Holder");

    if (username.equals("quit") && password.equals("Exit")){
      System.out.println("System shutting down");
      System.out.println("Bye.");
    }

    while( !username.equals("quit") && !password.equals("exit")){
      System.out.println("User Name:");
      username = scan.nextLine();
      System.out.println("password");
      password = scan.nextLine();

      if (username.equals("joy") && password.equals("sun")){
        System.out.println("You have logged in with priority 4");
      }

      else if (username.equals("gates") && password.equals("monopoly")){
        System.out.println("You have logged in with priority 1");
      }

      else if (username.equals("jobs") && password.equals("apple")){
        System.out.println("You have logged in with priority 3");
      }

      else if (username.equals("root") && password.equals("secret")){
        System.out.println("You have logged in with priority 5");
      }
      else if (!username.equals("root") || !password.equals("secret")){
        System.out.println("login failed");
      }
      else if (!username.equals("jobs") || !password.equals("apple")){
        System.out.println("login failed");
      }
      else if (!username.equals("gates") || !password.equals("monopoly")){
        System.out.println("login failed");
      }
      else if (!username.equals("joy") || !password.equals("sun")){
        System.out.println("login failed");
      }
  }

  }
}
