package algoritmos;
import javax.swing.JOptionPane;

public class Algoritmos{
    public static void main(String[] args){
        int a,b;
        a=Integer.parseInt(JOptionPane.showInputDialog("Num:"));
        b=Integer.parseInt(JOptionPane.showInputDialog("Num:"));
        maior(a,b);
    }

    public static void maior(int a, int b){
        if (a>b){
            System.out.println(b);
            System.out.println(a);
        }else{
            System.out.println(a);
            System.out.println(b);
        }
   }
}