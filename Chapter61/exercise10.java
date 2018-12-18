import java.util.Arrays;
class exercise10
{


  public static void main ( String[] args )
  {
    int[] arrayA = { 1, 2, 3, 4, 2 };
    int[] arrayB = { 4, 2, 3, 2, 1 };

    Arrays.sort(arrayA);
    Arrays.sort(arrayB);

    if (Arrays.equals(arrayB, arrayA) )
      System.out.println( "Same Elements" );
    else
      System.out.println( "DIFFERENT elements" );

  }
}
