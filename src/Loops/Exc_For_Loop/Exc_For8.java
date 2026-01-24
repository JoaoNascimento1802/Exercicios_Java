package Loops.Exc_For_Loop;

import java.util.Scanner;

public class Exc_For8 {

    public static void main(String[]args){

        Scanner scn = new Scanner(System.in);

        System.out.print("insira o tamanho do quadrado : ");
        int tamanhoQuadrado = scn.nextInt();

        int coluna = 0;

        for(int i = 1; i <= tamanhoQuadrado; i++){

            if(i==1){
                for(int j =1; j<= tamanhoQuadrado; j++){
                    System.out.print("*");

                    if(j == tamanhoQuadrado){
                        coluna = j;
                    }
                }
            }

            if(i>1 && i<tamanhoQuadrado){
                System.out.print("*");
            }

            if(i>1 && i<tamanhoQuadrado){
                System.out.print(" *");
            }

            if(i == tamanhoQuadrado){
                for(int k =1; k<= tamanhoQuadrado; k++){
                    System.out.print("*");
                }
            }


            System.out.println();
        }

    }
}
