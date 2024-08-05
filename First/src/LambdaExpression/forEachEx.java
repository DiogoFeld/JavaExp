package LambdaExpression;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class forEachEx {

    static List<Integer> inteiros = Arrays.asList(1,2,3,45);


    public static void main(String[] args) {


        inteiros.forEach((x) -> {
            boolean result =  (x % 2) == 0;
            System.out.println("Result: " + result);
        });

        inteiros.forEach(forEachEx::CheckPar);




    }


    public static boolean CheckPar(int numero){
        System.out.println("numero é "+ numero);
        return  (numero % 2) == 0;
    }


}
