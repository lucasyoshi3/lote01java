package algoritmos;

import javax.swing.JOptionPane;

public class Algoritmos{
    public static void main(String[] args){
        int angulo1=Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro angulo"));
        int angulo2=Integer.parseInt(JOptionPane.showInputDialog("Digite o segundp angulo"));
        int angulo3;
        angulo3=180-(angulo1+angulo2);
        System.out.println("O terceiro angulo e:"+angulo3);
    }
}