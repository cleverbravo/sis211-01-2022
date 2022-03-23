
public class programa9 {
    public static void funcion1(){
        System.out.println("hola desde la funcion 1");
    }
    public static void funcion2(){
        System.out.println("hola desde la funcion 2");
    }
    public static int funcion3(){
        System.out.println("funcion 3");
        return 3;
    }
    public static double funcion4(){
        System.out.println("funcion 4");
        return 4.4;
    }
    public static int[] funcion5(){
        System.out.println("funcion 5");
        return new int[]{1,2,3,4,5};
    }
    public static String funcion6(){
        System.out.println("funcion 6");
        return "hola desde la funcion 6";
    }
    public static void main(String []args){
        System.out.println("Hola mundo");
        programa9.funcion1();
        programa9.funcion2();
        int x=programa9.funcion3();
        System.out.println("x="+x);
    }
}
