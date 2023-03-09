package algoritmos;
import java.util.*;

public class Algoritmos{
    public static void main(String[] args){
        float seq,i;
        int n;
        Scanner e=new Scanner(System.in);
        System.out.println("Num:");
        n=e.nextInt();
        seq=0;
        for (i=1;i<=n;i++){
            seq=seq+(1/i);
        } 
        System.out.println(seq);
    }
}