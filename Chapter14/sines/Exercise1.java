import java.text.*;

public class Exercise1{
  public static void main(String[] args) {
    double angle = -90.0;
    double rad;
    DecimalFormat df = new DecimalFormat("##.######");

    System.out.println("Angle     Sine");
    System.out.println("-----     -----");

    for(; angle <= 90.0; angle = angle + 15.0){
      rad = angle * (Math.PI/180);
      if (angle < 0.0)
        System.out.println(angle + "      " + df.format(Math.sin(rad)));
      else if (angle == 0.0)
        System.out.println("  " + angle + "       " + df.format(Math.sin(rad)));
      else
          System.out.println(" " + angle + "       " + df.format(Math.sin(rad)));

    }

  }
}
