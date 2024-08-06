package LambdaExpression;

import java.util.function.Function;

public class FunctionEx {

    public static void main(String[] args) {

        Function<Integer, String> isAdulto = x -> x > 18 ? "Aduto" : "Infante";

        System.out.println(isAdulto.apply(11));

    }





}
