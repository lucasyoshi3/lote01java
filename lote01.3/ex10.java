import java.util.*;
public class ex10 {
    public static void main(String args[]){
        Scanner e=new Scanner(System.in);
        double casa[][]=new double[8][8];
        double soma_casa=0,soma_valor=0;
        int i;
        System.out.println("Casa: ");
        for(i=0;i<=7;i++){
            casa[1][i]=i+1;
            soma_casa=soma_casa+casa[1][i];
            System.out.println("|"+casa[1][i]+"|");
        }
        System.out.println("Valor: ");
        for(i=0;i<=7;i++){
            casa[2][i]=Math.pow(2,i);
            soma_valor=soma_valor+casa  [2][i];
            System.out.println("|"+casa[2][i]+"|");
        }
        System.out.println("Soma dos valores: "+(soma_casa+soma_valor));
    }
}
