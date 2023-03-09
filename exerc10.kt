package algoritmos;

import javax.swing.JOptionPane;

public class Algoritmos{
    public static void main(String[] args){
    float numi=Float.parseFloat(JOptionPane.showInputDialog("Valor do primeiro numero"));
    float numii=Float.parseFloat(JOptionPane.showInputDialog("Valor do segundo numero"));
    double diferenca;
    diferenca=numi-numii;
    System.out.println("A diferença e:"+diferenca);
   }
}