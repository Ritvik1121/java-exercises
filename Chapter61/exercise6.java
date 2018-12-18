import java.io.* ;

class exercise6
{

  public static void main ( String[] args )
  {
    int[] signal  = {5, 5, 4, 5, 6, 6, 7, 6, 5, 4, 1, 4};
    int[] smooth = new int[signal.length];

    // compute the smoothed value for each
    //  cell of the array smooth


    for(int i = 0; i < signal.length; i++)
    {

        if(i == 0){
            smooth[i] = (signal[i] + signal[i + 1]) / 2;
        }
        else if(i == signal.length - 1){
            smooth[i] = (signal[i] + signal[i - 1]) / 2;
        }

        else{
            smooth[i] = (signal[i] + signal[i + 1] + signal[i - 1]) / 3;
        }
    }

    // write out the result
    for ( int j=0; j < smooth.length; j++)
    {
        System.out.println(smooth[j]);
    }

  }
}
