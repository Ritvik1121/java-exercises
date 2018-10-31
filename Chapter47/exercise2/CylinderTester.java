public class CylinderTester{
  public static void main(String[] args) {
    Cylinder cylinder = new Cylinder(10.0, 4.0);

    System.out.println("The volume of this cylinder is " + cylinder.volume());
    System.out.println("The surface area of this cylinder is " + cylinder.surfaceArea());


  }
}
