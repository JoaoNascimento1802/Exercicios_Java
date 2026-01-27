package Loops.Exc_While;

import java.util.Scanner;

public class Teste_While2 {

    public static void main(String[]args){

        Scanner scn = new Scanner(System.in);

        System.out.print("Insira um valor : ");
        int num1 = scn.nextInt();

        while(num1 <=1000){
            if(num1 %2 ==0){
                System.out.println(num1);
            }
            num1++;

        }
    }
}
