import java.util.Scanner;

public class Exc_For4 {

    public static void main(String[]args){

        Scanner scn = new Scanner(System.in);

        System.out.print("Insira quantos alunos tem na turma ");
        int alunos = scn.nextInt();

        Double somaTotal = 0.0;

        for(int i = 1; i<=alunos; i++){

            System.out.print("Insira a nota do Aluno Numero: " + i + " " + ":");
            Double notas = scn.nextDouble();

            somaTotal+=notas;
        }

        Double media = (somaTotal/alunos);

        System.out.print(" A media dos alunos é :" + media);

        scn.close();
    }
}
