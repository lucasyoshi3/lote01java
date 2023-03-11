package algoritmos;

import javax.swing.JOptionPane;

public class Algoritmos{
    public static void main(String[] args){
        float raio=Float.parseFloat(JOptionPane.showInputDialog("Digite o tamanho do raio"));
        double circunferencia;
        circunferencia=2*3.14*raio;
        System.out.println("O tamanho da circunferencia e:"+circunferencia);
    }
}