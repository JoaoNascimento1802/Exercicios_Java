package Loops.Exc_For_Loop;

import java.util.Scanner;

public class Exc_For6 {

    public static void main(String[]agrs){

        Scanner scn = new Scanner(System.in);

        int maiorValor1 =0;

        int maiorValor2 =0;

        for(int i = 1; i<= 10; i++){
            System.out.print("Insira o valor N: " + i + " " + ":");
            int valor = scn.nextInt();

            if (valor > maiorValor1) {
                maiorValor2 = maiorValor1;


                maiorValor1 = valor;
            }
            else if (valor > maiorValor2) {
                maiorValor2 = valor;
            }

        }

        System.out.print("O primeiro maior valor é : " + maiorValor1);

        System.out.println("O segundo maior valor é : " + maiorValor2);

        scn.close();
    }
}
