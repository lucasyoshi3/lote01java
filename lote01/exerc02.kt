package algoritmos;

import javax.swing.JOptionPane;

public class Algoritmos{
    public static void main(String[] args){
        float salario=Float.parseFloat(JOptionPane.showInputDialog("Salario atual"));
        double salarioreajuste;
        salarioreajuste=salario*1.15;
        System.out.println("Salario reajustado:"+salarioreajuste);

    }


}