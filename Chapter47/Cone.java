import java.lang.Math;
public class Cone {

  double s;
  double r;
  double h;


  public Cone(double r, double h){
    this.r = r;
    this.h = h;
    this.s = s;

  }

  public double slantHeight(){
    this.s = Math.sqrt((r*r) + (h*h));
    return this.s;
  }

  public double angle(){
    return  Math.atan(r/h);
  }








}
