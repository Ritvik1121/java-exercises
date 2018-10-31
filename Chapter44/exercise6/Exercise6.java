import java.util.Scanner;

public class Exercise6{
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    boolean rightLength = false;
    boolean hasNum = false;
    char chr;
    boolean end = false;

    while (!end){
      System.out.println("Enter your password");
      String password = scan.nextLine();

      int length = password.length();

      if (length < 7){
        System.out.println("This password is not acceptable");
      } else if(length >= 7){
        rightLength = true;
      }

      boolean upperCase = !password.equals(password.toUpperCase());
      boolean lowerCase = !password.equals(password.toLowerCase());

      if (!upperCase){
        System.out.println("This password is not acceptable");
      } else if (!lowerCase){
        System.out.println("This password is not acceptable");
      }

      for (int i = 0; i < password.length(); i++){
        chr = password.charAt(i);
        if (chr == '0' || chr == '1' || chr == '2' || chr == '3' || chr == '4' || chr == '5' || chr == '6' || chr == '7' || chr == '8' || chr == '9'){
          hasNum = true;
        }
      }

      if (rightLength && upperCase && lowerCase && hasNum){
        System.out.println("acceptable password");
        end = true;
      }
    }



  }
}
