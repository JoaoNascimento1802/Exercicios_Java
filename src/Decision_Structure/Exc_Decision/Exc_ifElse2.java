package Decision_Structure.Exc_Decision;

import java.util.Scanner;

public class Exc_ifElse2 {

    public static void main(String[]args){

        Scanner scn = new Scanner(System.in);

        System.out.print("Digite a Letra do Sexo sendo F ou M : ");
        String gender = scn.next();

        if(gender.equals("F")){
            System.out.print("Feminino !");
        }
        else if(gender.equals("M")){
            System.out.print("Masculino");
        }
        else{
            System.out.print("Invalido");
        }
        scn.close();
    }
}
