package algoritmos;

import javax.swing.JOptionPane;

public class Algoritmos{
    public static void main(String[] args){
        int x = Integer.parseInt(JOptionPane.showInputDialog("Coloque o valor de x"));
        int y= Integer.parseInt(JOptionPane.showInputDialog("Coloque o valor de y"));
        int somaq;
        somaq=(x*x)+(y*y);
        System.out.println("A soma dos quadrados é;"+somaq);
    }
}