package POO.Heritage;

public class Heranca {

        public static void main(String[] args) {
        Lagarto l = new Lagarto();
        l.Introduzir();

        GOJIRA g = new GOJIRA();
        g.Introduzir();
        g.Botar();
        g.MegaBotar();

        System.out.println("\n" + g.sangue);

    }

}
