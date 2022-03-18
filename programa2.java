/*
Escribir un programa para leer por teclado un número y mostrar por pantalla el primer y el 
ultimo digito.
Input       Output
10          first digit=1
            last digit=0

85462       first digit=8
            last digit=2
5           first digit=5
            last digit=5
*/

import java.util.*;
public class programa2 {
    public static void main(String []args){
        Scanner cin=new Scanner(System.in);

        int numero=cin.nextInt();

        if(numero<0)
            numero*=-1;//numero=numero * -1;

        int ultimoDigito=numero%10;
        int cantidadDigitos=(int)Math.log10(numero);
        int potencia10=(int)Math.pow(10, cantidadDigitos);
        int primerDigito=numero/potencia10;
        
        System.out.println("first digit="+primerDigito);
        System.out.println("last digit="+ultimoDigito);
    }
}
