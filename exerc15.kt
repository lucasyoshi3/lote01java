package algoritmos;

import javax.swing.JOptionPane;
import java.lang.Math;

public class Algoritmos{
    public static void main(String[] args){
        float cat1=Float.parseFloat(JOptionPane.showInputDialog("Indique o valor do primeiro cateto"));
        float cat2=Float.parseFloat(JOptionPane.showInputDialog("Indique o valor do segundo cateto"));
        double hip;
        hip=Math.sqrt((cat1*cat1)+(cat2*cat2));
        System.out.println("O valor da hipotenusa e"+hip); 
    }
}