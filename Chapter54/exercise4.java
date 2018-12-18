import java.util.Scanner;

import javax.xml.transform.stax.StAXSource;

public class exercise4{


    public static void main(String[] args) {


        int i = 0;
        while(i == 0){
            Scanner scan = new Scanner(System.in);
            System.out.println("Enter the number (Input negative number to quit.)");
            int number = scan.nextInt();

            if(number < 0){
                break;
            }
            System.out.println(findPerfection(number));
        }
    }

    public static boolean findPerfection(int number){

        int total = 0;
        for(int i = 1;i < number;i++){

            if(number % i == 0){
                total = total + i;

            }
        }

        if(total == number){
            return true;
        }
        return false;
    }
}
