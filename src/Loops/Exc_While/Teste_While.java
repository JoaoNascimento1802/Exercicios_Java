package Loops.Exc_While;

import java.util.Scanner;

public class Teste_While {

    public static void main(String[]args){

        Scanner scn = new Scanner(System.in);

        while(true){
            System.out.println("Insira um numero ");
            int num1 = scn.nextInt();

            if(num1 == 10){
                System.out.print("Fim do Loop");
                break;
            }
        }
    }
}
