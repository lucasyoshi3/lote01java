package algoritmos;

import javax.swing.JOptionPane;

public class Algoritmos{
    public static void main(String[] args){
        float cel=Float.parseFloat(JOptionPane.showInputDialog("Temperatura em celsius"));
        float fah;
        fah=(9*cel+160)/5;
        System.out.println("A temperatura em fahrenheit:"+fah);
    
    }
}