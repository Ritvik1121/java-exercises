import java.util.Scanner;

public class Exercise4{
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    String input;
    int count;

    System.out.println("Enter a word:");
    input = scan.nextLine();

    count = input.length();

    for (int i = 0; i < count; i++){
      System.out.println(input.charAt(i));

    }
  }
}
