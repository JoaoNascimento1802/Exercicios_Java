package Loops.Exc_Decision;

import java.util.Scanner;

public class Exc_IfElse1 {

    public static void main(String[]args){

        Scanner scn = new Scanner(System.in);

        System.out.print("Insira o Primeiro Valor : ");
        int val1 = scn.nextInt();

        System.out.print("Insira o Segundo Valor : ");
        int val2 = scn.nextInt();

        if(val1 == val2){
            System.out.print("Os valores não podem ser iguais !! ");
        }
        else if(val1 > val2){
            System.out.print("O primeiro valor é maior !! ");
        }
        else{
            System.out.print("O segundo valor é maior !! ");
        }
    }
}
