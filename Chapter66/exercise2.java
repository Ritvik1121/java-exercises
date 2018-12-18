import java.util.Scanner;

class E2 {

    public static void main(String[] args) {


        int a = 0;

        String[] names = {"VIOLET SMITH", "JAMES BARCLAY"};
        String[] number = {"(312) 223-1937", "(418) 665-1223"};

        while(a == 0){


            Scanner scan = new Scanner(System.in);
            System.out.println("Last Name?");
            String lastName = scan.nextLine();
            lastName = lastName.toUpperCase();

            if(lastName.equals("QUIT")){
                System.out.println("Goodbye");
                break;

            }

            System.out.println("First Name?");
            String firstName = scan.nextLine();
            firstName = firstName.toUpperCase();

            String name = firstName + " " + lastName;
            System.out.println(name);

            boolean check = false;

            for(int i = 0; i < names.length; i++){
                if(name.equals(names[i])){
                    System.out.println("The number is: " + number[i]);
                    check = true;
                }
            }
            if(!check){
                System.out.println("There are no results for that name.");
            }
        }
    }
}
