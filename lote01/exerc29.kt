package algoritmos;
import java.io.*;
import javax.swing.JOptionPane;

public class Algoritmos{
    public static void main(String[] args){
        int tipo;
        float valor;
        tipo=0;
        valor=Float.parseFloat(JOptionPane.showInputDialog("Valor do investimento"));
        tipo=Integer.parseInt(JOptionPane.showInputDialog("Tipo de investimento"));
        switch(tipo){
            case 1:
                valor=valor+valor*3/100;
            break;
            case 2:
                valor=valor+valor*5/100;
            break;
            default: JOptionPane.showMessageDialog(null,"Tipo invalido");
        }
        JOptionPane.showMessageDialog(null,"Valor atual"+valor);
    }
}