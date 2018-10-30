import java.util.Scanner;

public class Exercise1{
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    System.out.println("Enter your name:");
    String name = scan.nextLine();
    String[] split = name.split("\\s+");

    System.out.println(split[0] + " " + split[1].toUpperCase());



  }
}
