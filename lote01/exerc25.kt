package algoritmos;
import javax.swing.JOptionPane;

public class Algoritmos{
    public static void main(String[] args){
        int hh[],mm[];
        hh=new int[3];
        mm=new int[3];
        hh[0]=Integer.parseInt(JOptionPane.showInputDialog("Hora de inicio"));
        mm[0]=Integer.parseInt(JOptionPane.showInputDialog("Minuto de inicio"));
        hh[1]=Integer.parseInt(JOptionPane.showInputDialog("Hora do termino"));
        mm[1]=Integer.parseInt(JOptionPane.showInputDialog("Minuto do termino"));
        if (hh[0]<hh[1]){
            hh[2]=hh[1]-(hh[0]+1);
        }else{
            hh[2]=(23-hh[0])+hh[1];
        }
        mm[2]=(60-mm[0])+mm[1];
        if (mm[2]>60){
            hh[2]=hh[2]+1;
            mm[2]=mm[2]-60;
        }
        JOptionPane.showMessageDialog(null,"Duraçao do jogo:"+hh[2]+":"+mm[2]);
    }
}