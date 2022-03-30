/*
Escribir un programa para almacenar los nombres,carnets de identidad y direcciones de 1 estudiantes
*/
import java.util.*;
public class programa13 {
    public static void funcion(int x){
        x=x+1;
    }

    public static void asignarNombre(Estudiante e){
        e.nombre="jose";
    }
    public static void main(String []args){
        Estudiante e=new Estudiante();
        e.nombre="pepe";
        asignarNombre(e);

        int x=2;
        funcion(x);
        System.out.println(x);

        System.out.println("nombre="+e.getNombre());
    }
}

class Estudiante{
    String nombre,ci,direccion;

    public String getNombre(){
        return nombre;
    }
    public void setNombre(String value){
        nombre=value;
    }
}
