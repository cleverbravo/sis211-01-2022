public class programa10 {
    public static int sumar(int a,int b){
        int c=a+b;
        return c;
    }
    public static double multiplicar(double a,int b){
        return a*b;
    }
    public static void main(String []args){
        int r1=programa10.sumar(5, 8);
        System.out.println("r1="+r1);
        double r2=programa10.multiplicar(1.1, 5);
        System.out.println("r2="+r2);
    }
}
