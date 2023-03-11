package algoritmos;
import javax.swing.JOptionPane;

public class Algoritmos{
    public static void main(String[] args){
        float d,div;
        float seq;
        div=1;
        d=1;
        seq=0;
        while(div<50){
            seq=seq+(div/d);
            div=div+1;
            d=d+2;
        }
        JOptionPane.showMessageDialog(null, seq);
    }
}