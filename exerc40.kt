package algoritmos;
import java.util.*;

public class Algoritmos{
    public static void main(String[] args){
        int i,x,c,f,primo;
        Scanner e=new Scanner(System.in);
        System.out.println("Numeros entre:");
        c=e.nextInt();
        f=e.nextInt();
        System.out.println("Primos:");
        for(i=c;i<=f;i++){
            if (i==1){
                System.out.println(i);
            }
            primo=2;
            for(x=2;x<=i;x++){
                if(i%x!=0){
                    primo=primo+1;
                }
            }
            
            if(primo==i){
                    System.out.println(primo);
            }
        }
    }
}