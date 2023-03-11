import java.util.*;
public class ex04 {
    public static void main(String[] args){
        int vetor[]=new int[30];
        float media;
        int i;
        Scanner e=new Scanner(System.in);
        media=0;
        for (i=0;i<=29;i++){
            vetor[i]=e.nextInt();
            media=media+vetor[i];
        }
        media=media/30;
        System.out.println("Media:"+media);
        System.out.println("\nPosicoes acima:"+acima(media,vetor));
        abaixo(media,vetor);
    }

    public static int acima(float media,int[] vetor){
        int i,soma;
        soma=0;
        for(i=0;i<=29;i++){
            if(vetor[i]>media){
                soma+=1;
            }
        }
        return soma;
    }

    public static void abaixo(float media,int[] vetor){
        int i;
        System.out.println("\nPosicoes dos vetores abaixo da media:");
        for(i=0;i<=29;i++){
            if (vetor[i]<media){
                System.out.println(i);
            }
        }
    }
}
