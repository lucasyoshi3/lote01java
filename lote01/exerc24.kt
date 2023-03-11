package algoritmos;
import javax.swing.JOptionPane;

public class Algoritmos{
    public static void main(String[] args){
        int num;
        String msg1="O numero e divisivel por 2 e3";
        String msg2="O numero nao e divisivel por 2 e 3";
        num=Integer.parseInt(JOptionPane.showInputDialog("Insira um numero"));
        if (num%2==0 & num%3==0 ){
            JOptionPane.showMessageDialog(null,msg1);
        }else{
            JOptionPane.showMessageDialog(null,msg2);
        }
    }
}