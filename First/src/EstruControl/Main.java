package EstruControl;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.printf("Hello and welcome!");


        int x = 0;
        for(;x < 10 ;){
       //     System.out.println(x);
            x++;
        }

        System.out.println("begin Continue");
        x = 0;
        for(x = 0; x < 10; x++){
            if(x > 5){
                continue;
            }
            System.out.println(x);

        }
        //pula a parte do bloco


        for(int i = 0;i< 5;i++){
            System.out.println("i é " + i);
            if(i >3){
                break;
            }
        }




    }
}

