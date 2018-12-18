import java.util.Scanner;

public class exercise2{

    public static void main(String[] args) {

        int i = 0;
        while(i == 0){
            Scanner scan = new Scanner(System.in);
            System.out.println("What is the number? To quit press enter.");
            String number = scan.nextLine();

            if(number.equals("")){
                break;
            }
            System.out.println(check(number));
        }
    }

    public static String check(String number){
        for(int i = 0; i < number.length(); i++){
            char letter = number.charAt(i);
            if(letter =='1'){
                if(number.charAt(i + 1) == '3'){
                    return "The number is unlucky";
                }
            }
        }
        return "The number in not unlucky";
    }
}
