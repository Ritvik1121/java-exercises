import java.util.Scanner;

public class Exercise7{
  public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);
    int years;
    int months;
    int days;

    System.out.println("Enter amount of years:");
    years = scan.nextInt();
    System.out.println("Enter amount of months:");
    months = scan.nextInt();
    System.out.println("Enter amount of days:");
    days = scan.nextInt();

    int yearsDays = years*365;
    int monthsDays = months*30;

    int allHours = (yearsDays + monthsDays) * 24;

    int seconds = ((allHours*60)*60);

    double percentage = seconds / 2500000000.0;


    System.out.println("Your age in seconds:" + seconds);
    System.out.println("The percentage of human lifespan:" + percentage);


  }
}
