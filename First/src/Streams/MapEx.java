package Streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class MapEx {

    public static void main(String[] args) {


        List<String> codigos = Arrays.asList("java","c# .Net", "python");

        for(String codigo : codigos){
            System.out.println(codigo);
        }
            System.out.println("---------");


        //codigos.stream().map(String::toUpperCase).forEach(System.out::println);
        //OU        use     LAMBDA

        Function<String, String> SubirCaixa = x -> {
            return x.toUpperCase();
        };

        codigos.stream().map(SubirCaixa).forEach(System.out::println);

    }
}
