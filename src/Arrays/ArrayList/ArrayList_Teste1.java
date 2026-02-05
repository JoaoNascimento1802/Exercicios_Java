package Arrays.ArrayList;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class ArrayList_Teste1 {

    public static void main(String[]args){

        ArrayList arl = new ArrayList();

        ArrayList<Double> arraylTeste = new ArrayList<Double>();
        arraylTeste.add(10.0);
        arraylTeste.add(12.0);
        arraylTeste.add(13.0);
        arraylTeste.add(14.0);

        arraylTeste.remove(1);

        System.out.println(arraylTeste);

        System.out.println(arraylTeste.get(1));

        System.out.println(arraylTeste.size());

        arraylTeste.remove(1);
    }
}
