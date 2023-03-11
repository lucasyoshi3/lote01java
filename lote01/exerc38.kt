package algoritmos;
import java.util.*;

public class Algoritmos{
    public static void main(String[] args){
        int n,maior,menor,i;
        Scanner e=new Scanner(System.in);
        System.out.println("Num:");
        n=e.nextInt();
        maior=n;
        menor=n;
        for (i=0;i<99;i++){
            System.out.println("Num:");
            n=e.nextInt();
            if (maior<n){
                maior=n;
            }
            if (menor>n){
                menor=n;
            }
        }
        System.out.println("Maior numero:"+maior);
        System.out.println("Menor numero:"+menor);
    }
}