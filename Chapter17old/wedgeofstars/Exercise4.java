import java.util.Scanner;

public class Exercise4{
  public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);
    int starNum;

    System.out.println("Intial number of stars:");
    starNum = scan.nextInt();

    while (starNum > 0){
      for (int i = 0; i < starNum; i++){
        System.out.print("*");
      }
      System.out.println("");
      starNum--;
    }
  }
}
