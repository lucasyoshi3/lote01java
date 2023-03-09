package algoritmos;
import java.util.*;

public class Algoritmos{
    public static void main(String[] args){
        int n,i;
        Scanner e=new Scanner(System.in);
        System.out.println("Num:");
        n=e.nextInt();
        i=1;
        tabuada(n,i);
    }
    
    public static void tabuada(int n,int i){
        int tabu;
        if (i<=10){
            tabu=n*i;
            System.out.println(tabu);
            i=i+1;
            tabuada(n,i);
        }
    }
}