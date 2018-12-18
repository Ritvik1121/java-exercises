import java.util.Arrays;

class exercise9
{

  public static void main ( String[] args )
  {
    int[] arrayA = { 1, 2, 3, 4 };
    int[] arrayB = { 1, 2, 3, 4 };

    System.out.print("Arrays says: ")    ;
    if ( Arrays.equals( arrayB, arrayA ) ){
      System.out.println( "Equal" );

    }
    else{
      System.out.println( "NOT Equal" );
    }

  }
}
