/*
Escribir un programa para almacenar los nombres,carnets de identidad y direcciones,edad de 5 estudiantes
*/
import java.util.*;
public class programa16 {
    public static Scanner cin=new Scanner(System.in);
    
    public static String leerPorTecladoString(String mensaje){
        System.out.println(mensaje);
        return cin.next();
    }
    public static int leerPorTecladoInt(String mensaje){
        System.out.println(mensaje);
        return cin.nextInt();
    }
    public static void main(String[]args){
        Estudiante estudiantes[]=new Estudiante[2];

        for(int i=0;i<estudiantes.length;i++){
            estudiantes[i]=new Estudiante();
            
            estudiantes[i].setNombre(leerPorTecladoString("Introduzca el nombre"));                
            estudiantes[i].setDireccion(leerPorTecladoString("Introduzca la direccion"));        
            estudiantes[i].setCi(leerPorTecladoString("Introduzca el CI"));
            estudiantes[i].setEdad(leerPorTecladoInt("Introduzca la edad"));
        }
        
        for(int i=0;i<estudiantes.length;i++){
            System.out.println("nombre="+estudiantes[i].getNombre());
            System.out.println("direccion="+estudiantes[i].getDireccion());
            System.out.println("ci="+estudiantes[i].getCi());
            System.out.println("edad="+estudiantes[i].getEdad());
        }
    }
}

class Estudiante{
    private String nombre,direccion,ci;
    private int edad;

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getCi() {
        return ci;
    }

    public void setCi(String ci) {
        this.ci = ci;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

}