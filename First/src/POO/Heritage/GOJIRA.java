package POO.Heritage;

public class GOJIRA extends Lagarto {





    GOJIRA(){
        this("GODZZILLA",50000000);
    }

    GOJIRA(String nome, double tamanaho){
        this.nome = nome;
        this.size = tamanaho;
    }



    @Override
    void Botar(){
        System.out.printf("Saiu um ovo de " + this.size/1000 + " de CM \n");
    }

    void MegaBotar(){
        super.Botar();
    }



}
