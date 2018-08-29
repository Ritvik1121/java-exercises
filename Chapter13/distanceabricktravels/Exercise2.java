import java.util.*;
public class Exercise2{
  public static void main(String[] args) {
    Scanner scan = new Scanner (System.in);
    float time;
    System.out.println("Enter number of seconds:");
    time = scan.nextFloat();
    double gravity = 32.174/2;
    float timeSquared = time*time;
    System.out.println("Distance:"+ gravity*timeSquared);

  }
}
