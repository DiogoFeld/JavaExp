package Generics;

public class Caixa<A> {

//A é o tipo generico dessa Classe

    private A coisa;

    public void Guardar(A coisa) {
        this.coisa = coisa;
    }

    public A Mostrar(){
        return this.coisa;
    }

    public A Tirar(){
        A coisa = this.coisa;

        this.coisa = null;
        return coisa;
    }

}
