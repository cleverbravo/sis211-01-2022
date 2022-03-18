/*
Escribir un programa para dividir dos numeros y mostrar el resultado por pantalla
Si la division produce un error mostrar el mensaje de 'error'.
Input               Output
5 7                 0.7142857
6 3                 2
1 0                 error
*/
import java.util.*;
public class programa1 {
    public static void main(String []args){
        Scanner cin=new Scanner(System.in);

        System.out.println("Introduzca un número:");
        double a=cin.nextDouble();
        System.out.println("Introduzca un número:");
        double b=cin.nextDouble();

        if(b==0){
            System.out.println("error");
        }
        else{
            double c=a/b;
            System.out.println(""+c);
        }

    }
}
