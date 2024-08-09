package Streams;

import java.util.function.Predicate;

public class Match {

    public static void main(String[] args) {

        var m = Monstros.supplierM.get();


        Predicate<Monstros> isNamed = x -> x.Nome.length() > 1;

        System.out.println(m.stream().allMatch(isNamed));
        System.out.println(m.stream().anyMatch(isNamed));
        System.out.println(m.stream().noneMatch(isNamed));
    }

}
