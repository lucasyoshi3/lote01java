package algoritmos;
import java.util.*;

public class Algoritmos{
    public static void main(String[] args){
        int cres[],troca,i;
        cres=new int[4];
        Scanner e=new Scanner(System.in);
        System.out.println("Num:");
        for (i=0;i<=2;i++){
            cres[i]=e.nextInt();
            if (i!=0){
                if (cres[i-1]>cres[i]){
                    System.out.println("Valores invalidos");
                    for(i=0;i<=2;i++){
                        cres[i]=0;
                    }
                i=-1;
                } 
                
            }    
        }
        cres[3]=e.nextInt();
        for(i=0;i<3;i++){
            if (cres[i]>cres[i+1]){
                troca=cres[i];
                cres[i]=cres[i+1];
                cres[i+1]=troca;
                i=-1;
            }
        }
        for (i=0;i<=3;i++){
            System.out.println(cres[i]);
        }
    }
}