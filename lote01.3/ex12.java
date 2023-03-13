import java.util.*;
public class ex12 {
    public static void main(String []args){
        Scanner e= new Scanner(System.in);
        String tabuleirox[]={"a","b","c","d","e","f","g","h"};
        String pecas[]={"Peao","Torre","Bispo","Cavalo","Rainha","Rei","Vazio"};
        int tabuleiroy[]={1,2,3,4,5,6,7,8};
        int x,y,soma,somapecas=0;
        System.out.println("---------------------");
        for(x=0;x<8;x++){
            for(y=0;y<8;y++){
                System.out.println("\nCodigo da casa "+tabuleirox[x]+""+tabuleiroy[y]+": ");
                soma=e.nextInt();
                System.out.println(pecas[soma-1]+"\n---------------------");
                somapecas=somapecas+soma;
            }
        }
        System.out.println("Soma das casas: "+somapecas);
    }
}
