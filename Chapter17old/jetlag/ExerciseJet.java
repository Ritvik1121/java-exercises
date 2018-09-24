import java.util.Scanner;

public class ExerciseJet{
  public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);
    double hours;
    int zones;
    int depart;
    int arrive;
    double recovery;


    System.out.println("Enter number of hoo=urs traveled:");
    hours = scan.nextDouble();
    System.out.println("Enter number of times zones crossed:");
    zones = scan.nextInt();
    System.out.println("Enter departure time in military time:");
    depart = scan.nextInt();
    System.out.println("Enter time of arrival in military time:");
    arrive = scan.nextInt();

    if (depart > 8 && depart < 12){
        depart = 0;
    }
    else if (depart > 12 && depart < 18){
      depart = 1;

    }
    else if (depart > 18 && depart < 22){
      depart = 3;
    }
    else if (depart > 22 || depart < 1){
      depart = 4;

    }
    else if (depart > 1 && depart < 8){
      depart = 5;
    }


    if (arrive > 8 && arrive < 12){
        arrive = 4;
    }
    else if (arrive > 12 && arrive < 18){
      arrive = 2;

    }
    else if (arrive > 18 && arrive < 22){
      depart = 0;
    }
    else if (arrive > 22 || arrive < 1){
      arrive = 1;

    }
    else if (arrive > 1 && arrive < 8){
      arrive = 3;
    }

    recovery = (hours/2 + (zones-3) + depart + arrive)/10;
    System.out.println("Days of recovery:" + recovery);
  }
}
