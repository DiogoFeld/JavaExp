package Errortreatment;

public class TrowMine extends  RuntimeException {

    private String nomeAtributo;

    public TrowMine(String NomeAtributo) {
        this.nomeAtributo = NomeAtributo;
    }

    public String GetMessage(){
        return String.format("O atributo %s esta negativo", nomeAtributo);
    }


}
