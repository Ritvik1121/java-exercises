import java.util.Scanner;

public class exercise3{


    public static void main(String[] args) {


        int i = 0;
        while(i == 0){
            Scanner scan = new Scanner(System.in);
            System.out.println("Enter the number");
            int intNumber = scan.nextInt();
            String stringNumber = Integer.toString(intNumber);

            if(intNumber < 0){
                break;
            }
            boolean isOdius = false;
            isOdius = check(intNumber);
            System.out.println(isOdius);

            System.out.println(stringNumber);

            if(stringNumber.equals("")){
                break;
            }

            boolean isUnLucky = check(stringNumber);
            System.out.println(isUnLucky);

            if(isOdius && isUnLucky){

                System.out.println("The number is unlucky");

            }
            else{
                System.out.println("The number is not unlucky");

            }
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
    public static boolean check(String number){

        for(int i = 0; i < number.length(); i++){
            char letter = number.charAt(i);
            if(letter =='1'){
                if(number.charAt(i + 1) == '3'){
                    return true;
                }
            }
        }
        return false;
    }
}
