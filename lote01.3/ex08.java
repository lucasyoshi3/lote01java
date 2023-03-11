import java.util.*;
public class ex08 {
    public static void main(String args[]){
        Scanner e=new Scanner(System.in);
        int matriz[][]=new int [4][3];
        int i,z;
        int total_vendido=0;
        for (i=0;i<=3;i++) {
            System.out.println((i+1) + " Semana");
            for (z = 0; z <=2; z++) {
                System.out.println("\nVenda do "+(z+1)+" produto:");
                matriz[i][z] = e.nextInt();
                total_vendido=total_vendido+matriz[i][z];
            }
            System.out.println("-----------------------------------------------");
        }
        vendido_mes(matriz);
        vendido_semana(matriz);
        System.out.println("-----------------------------------------------");
        System.out.println("Total vendido: "+total_vendido);
        System.out.println("-----------------------------------------------");
    }
    public static int vendido_mes(int matriz[][]){
        int quantidade_vendido[]=new int[3];
        int vendas_produto=0;
        int x,y,i;
        for(y=0;y<=2;y++) {
            for (i=0;i<=2;i++) {
                quantidade_vendido[i]=0;
                for (x = 0; x <= 3; x++) {
                    quantidade_vendido[i] = quantidade_vendido[i] + matriz[x][y];
                }
            }
            System.out.println("Quantidade do "+(y+1)+" produto vendido no mes: "+quantidade_vendido[y]);
            vendas_produto=vendas_produto+quantidade_vendido[y];
        }
        System.out.println("-----------------------------------------------");
        return(vendas_produto);
    }
    public static int vendido_semana(int matriz[][]){
        int quantidade_vendida[]=new int[3];
        int vendas_produtos=0;
        int i,x,y;
        for(x=0;x<=3;x++){
            for(i=0;i<=2;i++){
                quantidade_vendida[i]=0;
                for(y=0;y<=2;y++){
                    quantidade_vendida[i]=quantidade_vendida[i]+matriz[x][y];
                }
                vendas_produtos=vendas_produtos+quantidade_vendida[i];
            }
            if(x<3){
                System.out.println("Quantidades de todos os produtos vendido na semana "+(x+1)+": "+quantidade_vendida[x]);
            }
        }
        System.out.println("-----------------------------------------------");
        return vendas_produtos;
    }
}
