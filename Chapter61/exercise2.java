import java.io.* ;

class exercise2
{

  public static void main ( String[] args )
  {
    int[] data = {3, 1, 5, 7, 4, 12, -3, 8, -2};

    // declare and initialize variables for the two largest
    int largest = 0;
    int secondLargest = 0;

    // compute the two largest
    for ( int i= 0; i < data.length; i++)
    {
      if (data[i] > largest){
        secondLargest = largest;
        largest = data[i];
      }


    }

    // write out the two largest
    System.out.println(largest  );
    System.out.println(secondLargest);
  }
}
