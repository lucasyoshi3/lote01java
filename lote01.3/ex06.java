import java.util.*;
public class ex06{
    public static void main(String[] args){
        Scanner e=new Scanner(System.in);
        int vetor[]=new int[20];
        int i,troca;
        for(i=0;i<=19;i++){
            vetor[i]=e.nextInt();
        }
        for (i=0;i<=18;i++){
            if (vetor[i]>vetor[i+1]){
                troca=vetor[i];
                vetor[i]=vetor[i+1];
                vetor[i+1]=troca;
                i=-1;
            }
        }
        for(i=0;i<=19;i++){
            System.out.println(vetor[i]);
        }
    }
}