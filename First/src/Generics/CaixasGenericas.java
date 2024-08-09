package Generics;


public class CaixasGenericas {


    public static void main(String[] args) {

        Caixa<String> x1 = new Caixa<>();
        x1.Guardar("guarda-chuva");
        System.out.println(x1.Mostrar());
        System.out.println(x1.Tirar());
        System.out.println(x1.Mostrar());

        Caixa<Integer> x2 = new Caixa<>();
        x2.Guardar(102);
        System.out.println(x2.Tirar());


        CaixaHerdeiro x3 = new CaixaHerdeiro();
        x3.Guardar(10);
        //Herdeiro esta com o "pai" colocando o tipo que o genérico assume no caso


        CaixaHerdeiro2<Double> x4 = new CaixaHerdeiro2();
        x4.Guardar(10.4);
        //Nesse caso o Herdeiro Seta qual sera seu tipo

    }



}
