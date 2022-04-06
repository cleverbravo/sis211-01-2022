/*
trabajando con ArrayList
*/
import java.util.*;

public class programa19 {
    public static void main(String[] args) {
        Scanner cin=new Scanner(System.in);
        ArrayList<String> lista=new ArrayList();
        
        while(true){
            System.out.println("1.-Introduzca un nombre");        
            System.out.println("2.-Listar los nombres");
            System.out.println("3.-Listar las iniciales de cada nombre");
            System.out.println("4.-Salir");
            int opcion=cin.nextInt();
            switch(opcion){
                case 1:
                    lista.add(cin.next());
                    break;
                case 2:
                    System.out.println("La lista contiene los siguientes nombres:");
                    for(int i=0;i<lista.size();i++)
                        System.out.println(lista.get(i));
                    break;
                case 3:
                    System.out.println("La lista contiene las siguientes iniciales:");
                    for(int i=0;i<lista.size();i++)
                        System.out.println(lista.get(i).charAt(0));
                    break;
                case 4:
                    System.out.println("Gracias por usar este programa :)");
                    System.exit(0);
            }
        }
    }
}
