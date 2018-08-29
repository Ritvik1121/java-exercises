import java.util.*;
public class Exercise5{
  public static void main(String[] args) {
    Scanner scan = new Scanner (System.in);
    String str;
    int beginningIndex;
    int endingIndex;
    System.out.println("Enter a string:");
    str = scan.nextLine();
    System.out.println("Enter beginning index:");
    beginningIndex = scan.nextInt();
    System.out.println("Enter ending index:");
    endingIndex = scan.nextInt();
    String newStr = str.substring(beginningIndex, endingIndex);
    System.out.println("Original string:" + str + "\nSubstring:" + newStr);

  }
}
