package Decision_Structure.Exc_Decision;

import java.util.Scanner;

public class Exc_ifElse4 {

    public static void main(String[]args){

        Scanner scn = new Scanner(System.in);

        System.out.print("Digite o seu salário : ");
        Double salarioInicial = scn.nextDouble();

        Double salarioFinal = 0.0;

        Double aumento1 = (salarioInicial * 0.20);
        Double aumento2 = (salarioInicial * 0.15);
        Double aumento3 = (salarioInicial * 0.10);
        Double aumento4 = (salarioInicial * 0.05);



        if(salarioInicial <= 280.0){
            salarioFinal = salarioInicial + aumento1;
        }
            else if(salarioInicial >280.0 && salarioInicial <=700){
                salarioFinal = salarioInicial + aumento2;
            }

            else if(salarioInicial > 700.0 && salarioInicial <= 1500){
                salarioFinal = salarioInicial + aumento3;
            }

            else{
                salarioFinal = salarioInicial + aumento4;
            }

        Double valorAumento = salarioFinal - salarioInicial;
        Double porcentagemAumento = ((salarioFinal - salarioInicial)/salarioInicial)*100;

        System.out.println("O valor do Salario Inicial é : " + salarioInicial + "R$");

        System.out.println("O percentual de aumento é : " + porcentagemAumento + "%");

        System.out.println("O valor de aumento é : " + valorAumento + "R$");

        System.out.println("O salário final é : " + salarioFinal + "R$");
    }
}
