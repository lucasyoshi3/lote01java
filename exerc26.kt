package algoritmos;
import javax.swing.JOptionPane;

public class Algoritmos{
    public static void main(String[] args){
        int num[],troca,i;
        num=new int[2];
        for (i=0;i<2;i++){
            num[i]=Integer.parseInt(JOptionPane.showInputDialog("Digite num"));
        }
        if (num[0]>num[1]){
            troca=num[0];
            num[0]=num[1];
            num[1]=troca;
        }
        if (num[1]%num[0]==0){
            JOptionPane.showMessageDialog(null,"Multiplo");
        }else{
            JOptionPane.showMessageDialog(null,"Nao multiplo");
        }
    }
}