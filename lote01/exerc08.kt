package algoritmos;

import javax.swing.JOptionPane;

public class Algoritmos{
    public static void main(String[] args){
        float dp=Float.parseFloat(JOptionPane.showInputDialog("Coloque o valor do deposito na poupança"));
        double valor_apos_um_mes;
        valor_apos_um_mes=dp*1.3;
        System.out.println("O valor daqui um mes:"+valor_apos_um_mes);
    }
}