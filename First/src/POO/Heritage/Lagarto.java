package POO.Heritage;

public class Lagarto {

    String nome;
    double  size;
    protected final String sangue = "Frio";

    Lagarto(){
        this("lagarto",0.2);
    }

    Lagarto(String nome, double tamanaho){
        this.nome = nome;
        this.size = tamanaho;
    }

    void Introduzir(){
        System.out.println("ola meu nome é " + this.nome);
    }

    void Botar(){
        System.out.printf("Saiu um ovo de " + this.size/2 + " de CM");
    }
}
