import java.util.*;
public class ex05 {
    public static void main(String[] args){
        int vetor[]=new int[20];
        int i,soma;
        soma=0;
        Scanner e=new Scanner(System.in);
        for(i=0;i<=19;i++){
            vetor[i]=e.nextInt();
        }
        for(i=0;i<=9;i++){
            soma=(vetor[i]-vetor[19-i])+soma;
        }
    }
}
