package Streams;

import java.util.ArrayList;
import java.util.function.Supplier;

public class Monstros {

    public int Id;
    public int Nivel;
    public String Nome;

    public Monstros(int id, int nivel, String nome) {
        Id = id;
        Nivel = nivel;
        Nome = nome;
    }

    static Supplier<ArrayList<Monstros>> supplierM =  () -> {
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
}
