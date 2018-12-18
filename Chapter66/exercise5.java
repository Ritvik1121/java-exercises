import java.util.Scanner;
import java.util.Random;
import java.lang.Math;



class exercise5 {

    public static void main(String[] args) {

        Random ran = new Random();
        int changeNeg = 0;
        int change = 0;


        int[] fireFly1 = {1,2,3 };
        int[] fireFly2 = {5,7,8 };


        for(int i = 0; i > -1; i++){


            for(int a = 0; a < fireFly1.length; a++){
                changeNeg = ran.nextInt(2);

                if(changeNeg == 0){
                    change = ran.nextInt(10 - fireFly1[a]);
                    fireFly1[a] = fireFly1[a] + change;

                }
                if(changeNeg == 1){
                    change = ran.nextInt(10 - fireFly1[a]) * -1;
                    fireFly1[a] = fireFly1[a] + change;
                }
                System.out.println(fireFly1[a]);

            }


            for(int a = 0; a < fireFly2.length; a++){
                changeNeg = ran.nextInt(2);

                if(changeNeg == 0){
                    change = ran.nextInt(10 - fireFly2[a]);
                    fireFly2[a] = fireFly2[a] + change;

                }
                if(changeNeg == 1){
                    change = ran.nextInt(10 - fireFly2[a]) * -1;
                    fireFly2[a] = fireFly2[a] + change;
                }
                System.out.println(fireFly2[a]);

            }

            if(Math.sqrt((fireFly1[0] - fireFly2[0]) * (fireFly1[0] - fireFly2[0]) + (fireFly1[1] - fireFly2[1]) * (fireFly1[1] - fireFly2[1]) + (fireFly1[2] - fireFly2[2]) * (fireFly1[2] - fireFly2[2])) <= 1){
                System.out.println("Dead!");
                break;
            }
        }
    }
}
