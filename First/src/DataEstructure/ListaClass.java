package DataEstructure;

import java.util.LinkedList;
import java.util.Queue;

public class ListaClass {

    public static void main(String[] args) {
       // Cachorros
        Queue<String> listaCachorros = new LinkedList<String>();
        listaCachorros.add("Doninho");
        System.out.println(listaCachorros);
        listaCachorros.add("angela");

        System.out.println( listaCachorros.peek());
        System.out.println(listaCachorros);

        System.out.println( listaCachorros.poll());
        System.out.println(listaCachorros);

    }


}
