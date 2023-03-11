package algoritmos;

import javax.swing.JOptionPane;
public class Algoritmos{
    public static void main (String[] args){
        int x=Integer.parseInt(JOptionPane.showInputDialog("Valor de x"));
        int y=Integer.parseInt(JOptionPane.showInputDialog("Valor de y"));
        int z;
        z=x;
        x=y;
        y=z;
        System.out.println(x);
        System.out.println(y);
    }
}

