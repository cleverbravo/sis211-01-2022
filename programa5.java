/*
Escribir un programa para evaluar una expresion aritmetica con sumas y restas como ser:
1 - 5, que tiene un resultado de -4. (Java N-IDE)
Input                   Output
1 + 1                   2
1 - 1                   0
1 + 4                   5
*/
import java.util.*;
public class programa5 {
    public static void main(String []args){
        Scanner cin=new Scanner(System.in);
        int a=cin.nextInt();
        char operacion=cin.next().charAt(0);
        int b=cin.nextInt();
        int resultado=0;
        switch(operacion){
            case '+':
                resultado=a+b;
                break;
            case '-':
                resultado=a-b;
                break;
        }
        System.out.println(""+resultado);
    }
}
