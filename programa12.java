import java.util.Scanner;

/*
escribir un programa para almacenar los nombres,carnets de identidad y direcciones de 2 estudiantes

*/
public class programa12 {
    public static void main(String[]args){
        Scanner cin=new Scanner(System.in);
        Estudiante e1=new Estudiante(),e2=new Estudiante();
        e1.nombre=cin.next();
        e2.nombre="pepe";
        System.out.println("nombre:"+e1.nombre);
    }
}

class Estudiante{
    String nombre,ci,direccion;//atributos
}
