import java.io.* ;

public class ColSum
{

  public static void main ( String[] args )
  {
    int[][] data = { {3, 2, 5},
                     {1, 4, 4, 8, 13},
                     {9, 1, 0, 2},
                     {0, 2, 6, 3, -1, -8} };

    // declare the sum
    int sum[] = {0, 0, 0, 0, 0, 0, 0};

    // compute the sums for each row
    for ( int row=0; row < data.length; row++)
    {

      // compute the sum for this row
      for ( int col=0; col < data[row].length; col++)
      {
         if (data[row] == null){
           break;
         }

         sum[col] = sum[col] + data[row][col];
         System.out.println( "Column " + (col + 1) + ": " + sum[col] );
      }

      // write the sum for this row

    }
  }
}
