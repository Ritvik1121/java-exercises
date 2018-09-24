import java.util.Scanner;

public class Exercise2{
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    //variables
    String inputString;
    int times;

    //input variables
    System.out.println("Enter a word");
    inputString = scan.nextLine();

    times = inputString.length();

    while (times > 0){
      System.out.println(inputString);
      times = times - 1;

    }



  }
}
