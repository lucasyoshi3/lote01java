import java.util.*;
public class ex09 {
    public static void main(String args[]){
        Scanner e=new Scanner(System.in);
        int num;
        System.out.println("Digite um numero");
        num=e.nextInt();
        quadrado(num);
    }
    public static void quadrado(int num){
        double matriz[][]=new double [4][4];
        int i;
        for (i=0;i<=3;i++){
            matriz[i][i]=Math.pow(num,i);
            System.out.println(matriz[i][i]);
        }
    }
}

