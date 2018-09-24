import java.util.Scanner;

public class Exercise1{
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    int start;
    int end;

    System.out.println("Enter start number");
    start = scan.nextInt();
    System.out.println("Enter start number");
    end = scan.nextInt();

    if (start <= end){
      while (start !=end){
        System.out.println(start);
        start = start + 1;
      }
      System.out.println(start);

    }
  }

}
