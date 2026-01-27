package Decision_Structure.Exc_Decision;

import java.util.List;
import java.util.Scanner;

public class Exc_ifElse3 {

    public static void main(String[]args){

        Scanner scn = new Scanner(System.in);

        System.out.print("Digite a Letra : ");
        String letra = scn.next();

        String letraMaiuscula = letra.toUpperCase();

        if (List.of("A", "E", "I", "O", "U").contains(letraMaiuscula)) {
            System.out.print("É uma vogal");
        }
        else{
            System.out.print("É uma consoante");
        }
    }
}
