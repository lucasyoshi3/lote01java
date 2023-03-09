package algoritmos;
import java.util.*;

public class Algoritmos{
    public static void main(String[] args){
        int n,i,grao;
        Scanner e=new Scanner(System.in);
        grao=1;
        n=e.nextInt();
        while(grao<=n){
            System.out.println(grao);
            grao=grao*2;
        }
    }
}