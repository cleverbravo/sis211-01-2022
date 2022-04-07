
import java.util.*;
public class programa21 {
    static Scanner cin=new Scanner(System.in);

    static Estudiante fabricarNuevoEstudiante(){
        Estudiante e=new Estudiante();
        e.nombre=cin.next();
        e.apellido=cin.next();
        return e;
    }
    public static void main(String[] args) {
        ArrayList<Estudiante> lista=new ArrayList<>();
        while(true){
            System.out.println("1.-Introduzca un estudiante");        
            System.out.println("2.-Listar los estudiantes");
            System.out.println("3.-Ordernar");
            System.out.println("4.-Salir");
            int opcion=cin.nextInt();
            switch(opcion){
                case 1:
                    lista.add(fabricarNuevoEstudiante());
                    break;
                case 2:
                    System.out.println("La lista contiene los siguientes estudiantes:");
                    for(int i=0;i<lista.size();i++)
                        System.out.println(lista.get(i).nombre+" "+lista.get(i).apellido);
                    break;
                case 3:
                    lista.sort((e1,e2)->e1.nombre.compareTo(e2.nombre));
                    break;
                case 4:
                    System.out.println("Gracias por usar este programa :)");
                    System.exit(0);
            }
        }
    }
}

class Estudiante{
    String nombre,apellido;
}
