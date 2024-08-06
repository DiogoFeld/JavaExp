package LambdaExpression;

import java.util.function.Consumer;

class ConsumerEx {

    public static void main(String[] args) {
        Consumer<Produto> getTotalProduto = p -> System.out.println("meu nome é " + p.nome  + " e eu custo " + p.preco);

        Produto o = new Produto();
        o.nome = "nome";
        o.preco = 3.5;

        getTotalProduto.accept(o);
    }

}
