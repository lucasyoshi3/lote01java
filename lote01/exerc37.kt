package algoritmos;
import javax.swing.JOptionPane;

public class Algoritmos{
    public static void main(String[] args){
        int fino[]=new int[2];
        int n;
        fino[1]=1;
        fino[0]=0;
        n=Integer.parseInt(JOptionPane.showInputDialog("N final da sequencia"));
        while (fino[0]<n){
            if (fino[1]<=n){
                System.out.println(fino[1]);
            }
            fino[0]=fino[0]+fino[1];
            fino[1]=fino[1]+fino[0];
            if (fino[0]<=n){
                System.out.println(fino[0]);
            }
       }
    }
}