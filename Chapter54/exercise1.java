import java.util.Scanner;

public class exercise1{

    public static void main(String[] args) {

        int i = 0;
        while(i == 0){
            Scanner scan = new Scanner(System.in);
            System.out.println("What is the number");
            int number = scan.nextInt();

            if(number < 0){
                break;
            }
            boolean isOdius = false;
            isOdius = check(number);
            System.out.println(isOdius);
        }
    }


    public static boolean check(int number){

        String binary = "";
        String intString = "";
        int i = 0;
        int countOnes = 0;

        while(i == 0){
            int newNumber = number % 2;

            if(newNumber == 1){
                countOnes++;
            }

            intString = Integer.toString(newNumber);
            binary = binary + intString;

            number = number / 2;
            if(number == 0){
                if(countOnes % 2 == 0){
                    return false;
                }
                else{
                    return true;
                }
            }
        }
        return false;
    }
}
