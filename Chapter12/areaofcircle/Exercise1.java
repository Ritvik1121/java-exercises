import java.util.*;
public class Exercise1{
  public static void main(String[] args) {
    Scanner scan = new Scanner (System.in);
    double radius;

    System.out.println("Input the radius");
    radius = scan.nextDouble();
    double area = Math.PI*(radius*radius);

    System.out.println("The radius is:" + radius + "The area is:" + area);

  }
}
