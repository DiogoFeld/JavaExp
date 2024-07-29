package DataEstructure;

import javax.xml.crypto.dsig.keyinfo.KeyValue;
import java.util.Map;
import java.util.HashMap;

public class MapClass {

    public static void main(String[] args) {
        Map<Integer,String> cachorros = new HashMap<>();
        cachorros.put(1,"bino");
        cachorros.put(2,"alice");
        cachorros.put(3,"toninho");
        cachorros.put(11,"Chiquinha");

        System.out.println(cachorros.values());
        System.out.println(cachorros.keySet());
        System.out.println(cachorros.entrySet());
        System.out.println("------------- for -----");

        for(int chave : cachorros.keySet()){
            System.out.println(chave);
        }

        for(Map.Entry<Integer,String> dogs: cachorros.entrySet()){
            System.out.println(dogs.getValue());
            System.out.println(dogs.getKey());
        }

    }


}
