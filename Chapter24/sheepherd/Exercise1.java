import java.lang.Math;

public class Exercise1{
  public static void main(String[] args) {

    double n;
    int count = 0;



    for (int i = 0; i <= 25; i++){
      n = 220/(1+10 * Math.pow(0.83, i));
      System.out.println("Population:" + n);
      if (n < 80){
        count = count + 1;
      }
    }
    System.out.println("Year with supervision" + count);
  }
}
