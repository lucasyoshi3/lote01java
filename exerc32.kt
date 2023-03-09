package algoritmos;
import javax.swing.JOptionPane;

public class Algoritmos{
    public static void main(String[] args){
        int fat;
        fat=Integer.parseInt(JOptionPane.showInputDialog("Num"));
        fat=fat*fat;
        JOptionPane.showMessageDialog(null,"Fatorial:"+fat);
    }
}