package algoritmos;
import javax.swing.JOptionPane;

public class Algoritmos{
    public static void main(String[] args){
        float metros,min;
        int voltas;
        voltas=Integer.parseInt(JOptionPane.showInputDialog("Numero de voltas"));
        metros=Float.parseFloat(JOptionPane.showInputDialog("Tamanho do circuito(em metros)"));
        min=Float.parseFloat(JOptionPane.showInputDialog("Tempo de duracao"));
        metros=(metros*voltas)/1000;
        min=min/60;
        metros=metros/min;
        JOptionPane.showMessageDialog(null,"Velocidade media:"+metros+"km/h");
    }
}