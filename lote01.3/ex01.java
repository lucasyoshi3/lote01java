import java.util.*;
public class ex01 {
    public static void main(String[] args) {
        int vetor[] = new int[50];
        int i;
        float media, cta;
        Scanner e = new Scanner(System.in);
        media = 0;
        cta = 0;
        System.out.println("Num:");
        for (i = 0; i <= 49; i++) {
            vetor[i] = e.nextInt();
            if (vetor[i] >= 10 & vetor[i] <= 200) {
                media = media + vetor[i];
                cta = cta + 1;
            }
        }
        media = media / cta;
        System.out.println("Media:" + media);
        media = 0;
        for (i = 0; i <= 49; i++) {
            if (vetor[i] % 2 != 0) {
                media = media + vetor[i];
            }
        }
        System.out.println("Soma dos impares:" + media);
    }
}