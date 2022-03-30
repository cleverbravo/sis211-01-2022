/*
Escribir un programa para almacenar los nombres,carnets de identidad y direcciones de 5 estudiantes
*/
import java.util.*;
public class programa14 {
    public static String leerPorTeclado(String mensaje){
        Scanner cin=new Scanner(System.in);
        System.out.println(mensaje);
        return cin.next();
    }
    public static void main(String[]args){
        Estudiante estudiantes[]=new Estudiante[5];

        for(int i=0;i<estudiantes.length;i++){
            estudiantes[i]=new Estudiante();
            
            estudiantes[i].setNombre(leerPorTeclado("Introduzca el nombre"));                
            estudiantes[i].setDireccion(leerPorTeclado("Introduzca la direccion"));        
            estudiantes[i].setCi(leerPorTeclado("Introduzca el CI"));
        }
        
        for(int i=0;i<estudiantes.length;i++){
            System.out.println("nombre="+estudiantes[i].getNombre());
            System.out.println("direccion="+estudiantes[i].getDireccion());
            System.out.println("ci="+estudiantes[i].getCi());
        }
    }
}

class Estudiante{
    private String nombre,direccion,ci;

    public String getNombre() {
        return nombre;
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
