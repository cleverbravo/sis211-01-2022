/*
Escribir un programa para evaluar una expresion aritmetica con las 4 operaciones como ser:
1 - 5, que tiene un resultado de -4. (Java N-IDE)
Input                   Output
1 + 1 + 1               3
1 - 1                   0
1 + 4 - 1               4
1 + 4 * 2               9
8 * 2 / 4               4
*/
import java.util.*;
public class programa8 {
    public static void main(String []args){
        Scanner cin=new Scanner(System.in);
        String operacionesAritmeticas=cin.nextLine();//"1 + 4 - 1"  
        String datos[]=operacionesAritmeticas.split(" ");//{"1","+","4","-","1"}

        double[]vector=new double[datos.length/2+1];//numeros de la operacion
        char[]operaciones=new char[datos.length/2];

        for(int i=0,v=0,o=0;i<datos.length;i++){
            if(i%2==0)
               vector[v++]=Double.parseDouble(datos[i]);
            else
                operaciones[o++]=datos[i].charAt(0);
        }

        boolean podemosSumar=false;
        for(int s=0;s<2;s++){
            for(int i=0;i<operaciones.length;i++){
                double resultadoAux=0;
                switch(operaciones[i]){
                    case '*':
                        resultadoAux=vector[i]*vector[i+1];
                        break;
                    case '/':
                        resultadoAux=vector[i]/vector[i+1];
                        break;
                    case '+':
                        if(!podemosSumar)
                            continue;
                        resultadoAux=vector[i]+vector[i+1];
                        break;
                    case '-':
                        if(!podemosSumar)
                            continue;
                        resultadoAux=vector[i]-vector[i+1];
                        break;
                }
                i--;
                double []vectorNuevo=new double[vector.length-1];
                char []operacionesNuevo=new char[operaciones.length-1];
                for(int j=0,k=0;j<vectorNuevo.length;j++,k++){
                    if(k==i+1)
                        k++;
                    vectorNuevo[j]=vector[k];
                }
                for(int j=0,k=0;j<operacionesNuevo.length;j++,k++){
                    if(k==i+1)
                        k++;
                    operacionesNuevo[j]=operaciones[k];
                }
                vectorNuevo[i+1]=resultadoAux;
                vector=vectorNuevo;
                operaciones=operacionesNuevo;
            }
            podemosSumar=true;
        }
        System.out.println("Resultado="+vector[0]);
    }
}
