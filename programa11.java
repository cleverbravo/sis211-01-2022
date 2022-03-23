/*
Usando funciones escribir un programa para evaluar una expresion aritmetica con las 4 operaciones como ser:
1 - 5, que tiene un resultado de -4. (Java N-IDE)
Input                   Output
1 + 1 + 1               3
1 - 1                   0
1 + 4 - 1               4
1 + 4 * 2               9
8 * 2 / 4               4
*/
import java.util.*;
public class programa11 {

    public static double[]vector;
    public static char[] operaciones;

    public static double[] ObtenerNumeros(String[]datos){
        double[]vec=new double[datos.length/2+1];
        for(int i=0,v=0;i<datos.length;i+=2){
            vec[v++]=Double.parseDouble(datos[i]);
        }
        return vec;
    }
    public static char[] ObtenerOperaciones(String[]datos){
        char[]op=new char[datos.length/2];
        for(int i=1,o=0;i<datos.length;i+=2){
            op[o++]=datos[i].charAt(0);
        }
        return op;
    }
    public static double[] ObtenerNuevosNumeros(double[]vector,int i){
        double []vectorNuevo=new double[vector.length-1];
        for(int j=0,k=0;j<vectorNuevo.length;j++,k++){
            if(k==i+1)
                k++;
            vectorNuevo[j]=vector[k];
        }
        return vectorNuevo;
    }
    public static char[] ObtenerNuevasOperaciones(char[]operaciones,int i){
        char []operacionesNuevo=new char[operaciones.length-1];
        for(int j=0,k=0;j<operacionesNuevo.length;j++,k++){
            if(k==i+1)
                k++;
            operacionesNuevo[j]=operaciones[k];
        }
        return operacionesNuevo;
    }
    public static double RealizarOperaciones(boolean podemosSumar){
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
            double []vectorNuevo=ObtenerNuevosNumeros(vector, i);
            char []operacionesNuevo=ObtenerNuevasOperaciones(operaciones,i);
            vectorNuevo[i+1]=resultadoAux;
            vector=vectorNuevo;
            operaciones=operacionesNuevo;
        }
        return vector[0];
    }
    public static void main(String[]args){
        Scanner cin=new Scanner(System.in);
        String operacionesAritmeticas=cin.nextLine();//"1 + 4 - 1"  
        String datos[]=operacionesAritmeticas.split(" ");//{"1","+","4","-","1"}

        vector=ObtenerNumeros(datos);
        operaciones=ObtenerOperaciones(datos);

        RealizarOperaciones(false);
        double resultado=RealizarOperaciones(true);
        
        System.out.println("Resultado="+resultado);
    }
}

