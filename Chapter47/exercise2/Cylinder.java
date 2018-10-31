import java.lang.Math;

public class Cylinder{

  private double r;
  private double h;


  public Cylinder(Double r, double h){
    this.r = r;
    this.h = h;

  }

  public double getRadius(){
    return this.r;
  }

  public double getHeight(){
    return this.h;
  }

  public void setRadius(){
    this.r = r;
  }

  public void setHeight(){
    this.h = h;
  }
  public double volume(){
    return (Math.PI * (this.r * this.r) * this.h);
  }

  public double surfaceArea(){
    return (2 * Math.PI * (this.r * this.r)) + (2 * Math.PI * this.r * this.h);
  }

}
