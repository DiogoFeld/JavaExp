package LambdaExpression;

public class LambdaClass {

    Calculo m = new Soma();

    Calculo multi = (x,y) -> {return x * y;};

}
