package algoritmos;
import java.util.*;

public class Algoritmos{
    public static void main(String[] args){
        int a,b;
        Scanner e=new Scanner(System.in);
        System.out.println("Num a:");
        a=e.nextInt();
        System.out.println("Num b:");
        b=e.nextInt();
        System.out.println((maior(a,b)));
    }

    public static int maior(int a, int b){
        if (a>b){
            return a;
        }else{
            return b;
        }
    }
}