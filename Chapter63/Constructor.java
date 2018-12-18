import java.io.* ;

class Constructor
{
    private int[] data;

    public static void toString(int[] init)
    {
        for(int i = 0; i < init.length; i++){

            System.out.println(init[i]);

        }

    }

    public static double average(int[] init){

        double sum = 0.0;


        for(int i = 0; i < init.length; i++){

            sum = sum + init[i];

        }

        return sum / init.length;


    }

    public static double averageRange(int[] init, int start, int end){

        double sum = 0.0;

        if(end > init.length){
            return 0.0;
        }


        for(int i = start; i <= end; i++){

            sum = sum + init[i];
        }

        return sum / (end - start + 1);
    }
    public static void main ( String[] args )
    {
        int[] values = { 98,  99,  98,  99, 100, 101, 102, 100, 104, 105,
                        105, 106, 105, 103, 104, 103, 105, 106, 107, 106,
                        105, 105, 104, 104, 103, 102, 102, 101, 100, 102};
        System.out.println(averageRange(values, 1, 2));
    }
}
