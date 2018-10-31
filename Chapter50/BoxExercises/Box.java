public class Box{

  double width;
  double height;
  double length;
  double side;

  public Box(double width, double height, double length){
    this.width = width;
    this.height = height;
    this.length = length;

  }

  public Box(Box oldBox){
    this.width = oldBox.getWidth();
    this.height = oldBox.getHeight();
    this.length = oldBox.getLength();
  }

  public double getWidth(){
    return this.width;
  }

  public double getHeight(){
    return this.height;
  }

  public double getLength(){
    return this.length;
  }

  public double volume(){
    return (2 * faceArea() + 2 * topArea() + 2 * sideArea());
  }

  public Box biggerBox(Box oldBox){
    return new Box(.75*oldBox.getWidth(), .75*oldBox.getLength(), .75*oldBox.getHeight());
  }

  public double area(){
    return (this. width * this.length);
  }

  private double faceArea(){
    return this.width * this.height;
  }

  private double topArea(){
    return this.width * this.length;
  }

  private double sideArea(){
    return this.height * this.length;
  }

  public boolean nests(Box outsideBox){
    if (outsideBox.getHeight() > this.height && outsideBox.getWidth() > this.width && outsideBox.getLength() > this.length){
      return true;
    } else{
    return false;
    }
  }
}
