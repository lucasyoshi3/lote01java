package algortimos;
import javax.swing.*;

public class Algoritmos{
    public static void main(String[] args){
        int i,fat;
        float seq;
        i=0;
        fatorial(n,i);
        fat=fatorial(n);
    }

    public static int fatorial(int n,int i){
        int fat;
        float seq;
        fat=n;
        seq=0;
        if (i<=n){
            fat=fat*i;
            i+1;
            sequencia(fat);
            seq=seq+sequencia(fat);
        }else{
            return fat;
    }
    
    public static float sequencia(int fat){
        seq=1/fat;
        return seq;
    {
}

