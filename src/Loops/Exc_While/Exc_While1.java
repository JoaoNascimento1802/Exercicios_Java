package Loops.Exc_While;

import java.util.Scanner;

public class Exc_While1 {

    public static void main(String[]args){

        Scanner scn = new Scanner(System.in);

        System.out.print("Insira um valor Inteiro : ");
        long num1 = scn.nextLong();

        if(num1 <= 0){
            System.out.print("Insira um valor maior que 0 !");
            num1 += 0;
        }
        else{
            while(num1 != 1){
                if(num1 %2 ==0){
                    num1 = num1/2;

                    System.out.print(num1 + " -->");
                }
                else{
                    num1 =(num1*3)+1;

                    System.out.print(num1 + " -->");
                }
            }
        }

        System.out.print("Fim do Loop !");

        scn.close();
    }
}
