package algoritmos;
import java.util.*;
import java.lang.math;

public class Algoritmos{
    public static void main(String[] args){
        int a,b,c;
        double delta,x1,x2;
        Scanner e=new Scanner(System.in);
        System.out.println("Valor de a");
        a=e.nextInt();
        System.out.println("Valor de b");
        b=e.nextInt();
        System.out.println("Valor de c");
        c=e.nextInt();
        delta=d(a,b,c);
        x1=(-b+(Math.sqrt(delta)))/2*a;
        x2=(-b-(Math.sqrt(delta)))/2*a;
        System.out.println("Valor do x1:"+x1+"\nValor do x2"+x2);
    }
    
    public static int d(int a, int b, int c){
        int delta;
        delta=(b*b)-4*a*c;
        System.out.println(delta);
        return delta;
    }
}
