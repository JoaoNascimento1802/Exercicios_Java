package Loops.Exc_For_Loop;

import java.util.Scanner;

public class Exc_For3 {

    public static void main(String[]args){

        Scanner scn = new Scanner(System.in);

        System.out.print("Insira o valor inteiro que deseja saber quais os pares e impares tem até chegar ao inteiro:");
        int valorint = scn.nextInt();

        for(int i= 1; i <= valorint; i++){
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
