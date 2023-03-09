package algoritmos;

import javax.swing.JOptionPane;

public class Algoritmos{
    public static void main(String[] args){
        float h=Float.parseFloat(JOptionPane.showInputDialog("Digite o valor da altura"));
        float larg=Float.parseFloat(JOptionPane.showInputDialog("Digite o valor da largura"));
        float comp=Float.parseFloat(JOptionPane.showInputDialog("Digite o valor do comprimento"));
        double volume;
        volume=h*larg*comp;
        System.out.println("O volume e"+volume);
    }
}