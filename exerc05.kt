package algoritmos;

import javax.swing.JOptionPane;
import java.lang.Math;

public class Algoritmos{
    public static void main(String[] args){
        int a =Integer.parseInt(JOptionPane.showInputDialog("Informe o valor de a"));
        int b =Integer.parseInt(JOptionPane.showInputDialog("Informe o valor de b"));
        int c =Integer.parseInt(JOptionPane.showInputDialog("Informe o valor de c"));
        double bhasI;
        double bhasII;
        double delta;
        delta=b*b-4*a*c;
        bhasI=(-b+(Math.sqrt(delta)))/(2*a);
        bhasII=(-b-(Math.sqrt(delta)))/(2*a);
        System.out.println("O valor de xI e:"+bhasI);
        System.out.println("O valor de xII e:"+bhasII);
        System.out.println("Valor do delta:"+delta);
    }


}