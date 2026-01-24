package Loops.Exc_For_Loop;

import java.util.Scanner;

public class Exc_For5 {

    public static void main(String[]args){

        Scanner scn = new Scanner(System.in);

        int maiorValor = 0;

        for(int i = 1; i<=10; i++){

            System.out.print("Insira o valor N: " + i + " " + ":");
            int valor = scn.nextInt();

            if(valor>maiorValor){
                maiorValor=valor;
            }
        }

        System.out.print("O maior valor é : " + maiorValor);

        scn.close();
    }
}
