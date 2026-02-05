package Arrays.Array;

import java.util.Scanner;
import java.util.Arrays;

public class Exc_Array1 {

    public static void main(String[]args){

        Scanner scn = new Scanner(System.in);

        System.out.print("Insira o tamanho da sua turma : ");
        int size = scn.nextInt();

        Double[] arrayTurma = new Double[size];

        for(int i = 0; i<arrayTurma.length; i++){
            System.out.print("Insira a nota do aluno N: " + i + " :");
            Double notas = scn.nextDouble();

            arrayTurma[i] = notas;
        }

        //media da turma
        Double TotalNotas = 0.0;

        for(Double i : arrayTurma){
            TotalNotas = TotalNotas + i;
        }

        Double media = (TotalNotas/size);

        System.out.printf("A media da turma é : %.2f", media);

        System.out.println();

        //Aprovados e Reprovados
        Double notaAtual =0.0;
        int alunosPassaram = 0;
        int alunosReprovados = 0;

        for(Double notasAlunos : arrayTurma){
            notaAtual += notasAlunos;
            if(notaAtual>= 7){
                alunosPassaram++;
                notaAtual = 0.0;
            }
            else{
                alunosReprovados++;
                notaAtual = 0.0;
            }
        }

        System.out.println("O total de alunos que passaram de ano foram de : " + alunosPassaram);

        System.out.println("O total de alunos que não passaram de ano foram de : " + alunosReprovados);

        //Maior nota
        Double maiorNotaFinal = 0.0;
        Double maiorNotaAtual = 0.0;

        for(Double notasTotais : arrayTurma){
            maiorNotaAtual = notasTotais;

            if(maiorNotaAtual > maiorNotaFinal){
                maiorNotaFinal = maiorNotaAtual;
            }
        }

        System.out.println("A maior nota foi : " + maiorNotaFinal);
    }
}
