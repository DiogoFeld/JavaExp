package POO.Abstraction;

public class Garfo extends  ObjetoDeCozinha{

    final String nome = "garfo";

    Garfo(String _uso) {
        super(_uso);
    }

    @Override
    public String Introducao() {
        return "Meu nome é " + this.nome;
    }

}
