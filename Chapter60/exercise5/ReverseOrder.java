class ReverseOrder
{
  public static void main ( String[] args )
  {
    int[] val = {0, 1, 2, 3};
    int[] temp = {0, 0, 0, 0};

    System.out.println( "Original Array: "
        + val[0] + " " + val[1] + " " + val[2] + " " + val[3] );

    // reverse the order of the numbers in the array
    int count = 0;
    for(int i = val.length - 1; i > 0; i--){
      temp[count] = val[i];
      count++;
    }



    System.out.println( "Reversed Array: "
        + temp[0] + " " + temp[1] + " " + temp[2] + " " + temp[3] );
   }
}
