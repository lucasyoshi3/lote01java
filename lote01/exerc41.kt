package algoritmos;
import javax.swing.JOptionPane;

public class Algoritmos{
    public static void main(String[] args){
        int i,c;
        for (i=1;i<=6;i++){
            for(c=6;c>=1;c--){
                if (c+i==7){
                    JOptionPane.showMessageDialog(null,(c)+"e"+(i));
                    
                }
            }
        }
    }
}