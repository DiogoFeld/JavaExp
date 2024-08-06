package LambdaExpression;

import java.util.ArrayList;
import java.util.function.Supplier;

public class SupplyEx {

    public static void main(String[] args) {

        Supplier<ArrayList<String>> supplierS =  () -> {
        ArrayList<String> list = new ArrayList<String>();
        list.add("A");
        list.add("B");
        list.add("C");


        return list;

        };

        System.out.println(supplierS.get());



    }
}




