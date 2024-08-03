package POO.Abstraction;

public abstract class ObjetoDeCozinha implements  Objeto{

    String uso = "";

    ObjetoDeCozinha(String _uso){
        this.uso = _uso;
    }


    public boolean UsaCozinha(){
        return this.uso.toUpperCase() == "COZINHA";
    }

    public boolean UsaMesa(){
        return this.uso.toUpperCase() == "MESA";

    }


}
