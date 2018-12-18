import java.io.* ;

class exercise1
{

  public static void main ( String[] args )
  {
    int[] data = {3, 2, 5, 7, 9, 12, 97, 24, 54};

    // declare and initialize three sums
    int evenSum = 0;
    int oddSum = 0;
    int allSum = 0;

    // compute the sums
    for ( int i=0; i < data.length; i++)
    {
      if (i % 2 == 0){
        evenSum = evenSum + data[i];
      } else {
        oddSum = oddSum + data[i];
      }
      allSum = allSum + data[i];
    }

    // write out the three sums
    System.out.println(evenSum);
    System.out.println(oddSum);
    System.out.println(allSum);


  }
}
