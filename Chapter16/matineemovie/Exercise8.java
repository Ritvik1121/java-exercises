import java.util.Scanner;

public class Exercise8{
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    int age;
    int time;

    System.out.println(" Enter your age");
    age = scan.nextInt();
    System.out.println(" Enter your time");
    time =  scan.nextInt();

    if (age <= 13){
      if(time > 1600)
        System.out.println("Ticket Price: 2");
      else
      System.out.println("Ticket Price: 4");
    }

    else if (age >= 13){
      if(time > 1600)
        System.out.println("Ticket Price: 5");
      else
      System.out.println("Ticket Price: 8");
    }



  }
}
