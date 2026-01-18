import java.util.Scanner;

public class Exc_For1 {

    public static void main(String[]args){

        Scanner scn = new Scanner(System.in);

        for(int i = 1; i <= 100; i++){
            if(i%2 == 1){
                System.out.println("Os valores impares são " + i);
            }
        }
        scn.close();
    }
}
