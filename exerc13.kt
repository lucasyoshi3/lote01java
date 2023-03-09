package algoritmos;

import javax.swing.JOptionPane;

public class Algoritmos{
    public static void main(String[] args){
        float qalimentos=Float.parseFloat(JOptionPane.showInputDialog("Digite a quantidade de alimentos em kg"));
        float tempo;
        tempo=(qalimentos*1000)/50;
        System.out.println("Tempo de duração do alimento:"+tempo);
    }
}