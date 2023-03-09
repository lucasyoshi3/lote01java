package algoritmos;

import javax.swing.JOptionPane;

public class Algoritmos{
    public static void main(String[] args){
        int base=Intenger.parseInt(JOptionPane.showInputDialog("Valor da base"));
        int h=Intenger.parseInt(JOptionPane.showInputDialog("Valor da altura"));
        double area=(base*h)/2;
        System.out.println("A area do triangulo é"+area);


    }


}