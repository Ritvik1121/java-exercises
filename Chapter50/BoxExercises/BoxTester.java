public class BoxTester{
  public static void main(String[] args) {

    Box oldBox = new  Box( 2.5, 5.0, 6.0 ) ;

    //System.out.println( "Area: "  + box.area() + " volume: " + box.volume());
    //System.out.println( "length: " + box.getLength() + " height: " + box.getHeight() + " width:  " + box.getWidth());

    //System.out.println( "Area: "  + box.area() + " volume: " + box.volume() );
    //System.out.println( "topArea: "  + box.topArea() );

    //Box bigBox = new Box(oldBox.biggerBox(oldBox));
    //System.out.println( "Area: "  + bigBox.area() + " volume: " + bigBox.volume() );
    //System.out.println( "length: " + bigBox.getLength() + " height: " + bigBox.getHeight() + " width:  " + bigBox.getWidth());

    Box outsideBox = new Box(4.0, 4.0, 4.0);

    System.out.println(insideBox.nests(outsideBox));
  }
}
