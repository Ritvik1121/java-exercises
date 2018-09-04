import java.util.Scanner;
import java.lang.Math;

public class Exercise6{
  public static void main(String[] args) {

    double windSpeed;
    double temperature;


    Scanner scan = new Scanner(System.in);

    System.out.println("Enter wind speed:");
    windSpeed = scan.nextDouble();
    System.out.println("Enter temperature");
    temperature = scan.nextDouble();

    double windChill = 35.74 + (0.6125*temperature) - (35.75*Math.pow(windSpeed, 0.16)) + (0.4275*temperature*Math.pow(windSpeed, 0.16));

    if (windSpeed < 3)
      System.out.println("Wind chill:" + temperature);

    else if (temperature > 50)
      System.out.println("Wind chill:" + temperature);

    else
      System.out.println("Wind chill:" + windChill);





  }

}
