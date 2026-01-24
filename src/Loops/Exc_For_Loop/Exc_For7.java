package Loops.Exc_For_Loop;
import java.util.Scanner;

public class Exc_For7 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Insira o Tamanho do quadrado: ");
        int tamanhoQuadrado = scn.nextInt();

        for(int i = 1; i <= tamanhoQuadrado; i++){

            for(int j = 1; j <= tamanhoQuadrado; j++){
                System.out.print("*");
            }

            System.out.println();
        }
    }
}