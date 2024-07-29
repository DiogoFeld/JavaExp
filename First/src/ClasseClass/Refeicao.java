package ClasseClass;

public class Refeicao {

    public static void main(String[] args) {
         Comida Feijao = new Comida("feijao",1.6);
         Comida Alface  = new Comida("feijao",0.6);

        System.out.println(Feijao.calorias);

         Pessoa Mateuss = new Pessoa("mateus",88);
        Mateuss.Comer(Feijao);
        Mateuss.Comer(Alface);

        Mateuss.Apresentar();

         //88 + 1.6 + 0.6 = 90.2


    }


}



class Pessoa{
     String Nome;
     double Peso;

     Pessoa(String Nome, double Peso){
         this.Nome = Nome;
         this.Peso = Peso;
     }


     public void Apresentar(){
         System.out.println("Nome: "+Nome + " tenho Peso " + this.Peso);
     }

     public void Comer(Comida comida){
         this.Peso += comida.peso;
     }

}

class Comida{

    static int calorias =450;

    String nome;
    double peso;

    Comida(String Nome, double Peso){
        this.nome = Nome;
        this.peso = Peso;
    }
}



