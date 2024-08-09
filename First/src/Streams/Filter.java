package Streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Filter {

    public static void main(String[] args) {
        Supplier<ArrayList<Monstros>> supplierM =  () -> {
            ArrayList<Monstros> list = new ArrayList<Monstros>();


            Monstros a = new Monstros(1,2,"a");
            list.add(a);
            Monstros b = new Monstros(2,1,"b");
            list.add(b);
            Monstros c = new Monstros(3,4,"c");
            list.add(c);
            Monstros d = new Monstros(4,5,"hidra");
            list.add(d);
            Monstros e = new Monstros(5,10,"dragao");
            list.add(e);
            return list;
        };



        List<Monstros> monstros = supplierM.get();
        Predicate<Monstros> monstrosHighLv = x -> x.Nivel >=5;

        Consumer<Monstros> getNome = x -> System.out.println(x.Nome);


        monstros.stream().filter(monstrosHighLv).forEach(getNome);
    }





}
