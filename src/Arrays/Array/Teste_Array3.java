package Arrays.Array;

import java.util.Scanner;
import java.util.Arrays;

public class Teste_Array3 {

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        int[] array1 = new int[10];

        Arrays.fill(array1,4);

        System.out.println(Arrays.toString(array1));
    }
}