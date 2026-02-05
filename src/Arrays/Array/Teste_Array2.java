package Arrays.Array;

import java.util.Scanner;

public class Teste_Array2 {

    public static void main(String[]args){

        Scanner scn = new Scanner(System.in);

        int[] array1 = new int[100];

        int valor =0;

        //codigo errado para teste;
//        for(int posicao =0; posicao < array1.length; posicao++){
//            for(int val1 = 0; val1<100; val1++){
//                val1 += 1;
//
//                array1[posicao] = val1;
//                System.out.println(array1[posicao]);
//            }
//
//        }

        for(int i = 0; i < array1.length; i++){
            array1[i] = i*2;

            System.out.println("Posição " + i + " recebeu valor: " + array1[i]);
        }
    }
}
