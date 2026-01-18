import java.util.Scanner;

public class Exc_For2 {

    public static void main(String[]Args){

        Scanner scn = new Scanner(System.in);

        for(int i = 1; i<= 100;i++){
            if(i%2 == 0){
                System.out.println("O valor " + i +" é par");
            }
            else{
                System.out.println("O valor " + i +" é impar");
            }
        }
        scn.close();
    }
}
