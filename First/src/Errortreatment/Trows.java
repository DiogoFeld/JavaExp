package Errortreatment;

public class Trows
{

    public static void main(String[] args) {

        //        throw  new RuntimeException();

        try{
            throw  new TrowMine("problema");
        }
        catch(TrowMine e){
            System.out.println(e.GetMessage());
        }
        finally {
            System.out.println("End");
        }


    }

}
