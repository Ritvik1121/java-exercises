public class Excerise2{
    public static void main (String[] arg){
        double sinValue = Math.sin(0.5236);
        double cosValue = Math.cos(0.5236);

        double sumValues = (sinValue * sinValue) + (cosValue * cosValue);
        
        System.out.println("Sine:" + sinValue + "\tCosine:" + cosValue + "\tSum of Squares:" + sumValues);
    }
}
