/*
Escribir un programa para evaluar una expresion aritmetica con las 4 operaciones aritmeticas como ser:
1 - 5, que tiene un resultado de -4. (Java N-IDE)
Input                   Output
1 + 1                   2
1 - 1                   0
1 + 4                   5
2 * 5                   10
1 / 10                  0.1
*/
import java.util.*;
public class programa6 {
    public static void main(String []args){
        Scanner cin=new Scanner(System.in);
        float a=cin.nextFloat();
        char operacion=cin.next().charAt(0);
        float b=cin.nextFloat();
        float resultado= 0;
        switch(operacion){
            case '+':
                resultado=a+b;
                break;
            case '-':
                resultado=a-b;
                break;
            case'*':
                resultado=a*b;
                break;
            case '/':
                resultado=a/b;
                break;
        }
        System.out.println(""+resultado);

    }
}
