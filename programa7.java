/*
Escribir un programa para evaluar una expresion aritmetica con sumas y restas como ser:
1 - 5, que tiene un resultado de -4. (Java N-IDE)
Input                   Output
1 + 1 + 1               3
1 - 1                   0
1 + 4 - 1               4
*/
import java.util.*;
public class programa7 {
    public static void main(String []args){
        Scanner cin=new Scanner(System.in);

        String operacionesAritmeticas=cin.nextLine();//"1 + 4 - 1"   "5"
        String datos[]=operacionesAritmeticas.split(" ");//{"1","+","4","-","1"}
        double resultado=0;//elemento neutro de las sumas y restas
        char operacion=' ';
        for(int i=0;i<datos.length;i++){
            double a=Double.parseDouble(datos[i++]);
            
            switch(operacion){
                case '+':
                    resultado=resultado+a;
                    break;
                case '-':
                    resultado=resultado-a;
                    break;
                default:
                    resultado=a;
            }
            if(i<datos.length)
                operacion=datos[i].charAt(0);
        }
        System.out.println(""+resultado);
    }
}
