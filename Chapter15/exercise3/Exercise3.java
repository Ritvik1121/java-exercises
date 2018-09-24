
import java.util.Scanner; 
public class Exercise3{
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    String firstWord;
    String secondWord;
    int num;

    System.out.println("enter first word");
    firstWord = scan.nextLine();
    System.out.println("enter second word");
    secondWord = scan.nextLine();

    num = firstWord.length() + secondWord.length();

    System.out.print(firstWord);
    while (num < 30){
      System.out.print(".");
      num = num + 1;

    }
    System.out.print(secondWord);



  }
}
