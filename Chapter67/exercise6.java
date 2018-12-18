import java.io.* ;

public class exercise6
{
  static int[][] data = { {3, 2, 5},
                     {1, 4, 4, 8, 13},
                     {9, 1, 0, 2},
                     {0, 2, 6, 3, -1, 8},
                     {-1, -2, -3, 4, 5, 45  },
                     {56},
                     {0, 1, 2, 3, 4, 5, 6, 7} };

  private static void printArray()
  {
    for ( int row=0; row < data.length; row++)
    {
      for ( int col=0; col < data[row].length-1; col++)
         System.out.print( data[row][col] + ", " );
      System.out.println( data[row][data[row].length-1] );
    }
  }

  public static void main ( String[] args )
  {
    // print out the initial array
    printArray();
    System.out.println();

    // reverse each row
    for ( int row=0; row < data.length; row++)
    {
      int count = 0;
      int endInx = data[row].length;
      for ( int col=0; col < endInx; col++)
      {
        System.out.println(data[row][data[row].length - count - 1]);
        count++;
        if(count == data[row].length){
          break;
        }
      }
    }

    // print out the reversed array
    //printArray();
  }
}
