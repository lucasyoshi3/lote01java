import java.util.*;
public class ex02 {
    public static void main(String[] args){
        int vetor[]=new int[100];
        int maior,menor,i;
        float media;
        media=0;
        maior=0;
        menor=0;
        Scanner e=new Scanner(System.in);
        System.out.println("Num:");
        for(i=0;i<=99;i++){
            vetor[i]=e.nextInt();
            media=media+vetor[i];
            if(i==0){
                maior=vetor[i];
                menor=vetor[i];
            }
            if(vetor[i]>maior){
                maior=vetor[i];
            }
            if(vetor[i]<menor){
                menor=vetor[i];
            }
        }
        media=media/100;
        System.out.println("Maior numero:"+maior+"\nMenor numero:"+menor);
        System.out.println("Media:"+media);
    }
}
