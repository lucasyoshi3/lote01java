package algoritmos;
import javax.swing.*;

public class Algoritmos{
    public static void main(String[] args){
        int i,n,cta;
        float seq,fat;
        i=0;
        n=Integer.parseInt(JOptionPane.showInputDialog("N:"));
        seq=1;
        fat=1;
        for (i=1;i<=n;i++){ 
            for(cta=1;cta<=i;cta++){
                fat=fat*cta;
            }
            seq=seq+(1/fat);
        }
        System.out.println(seq);
    }  
}