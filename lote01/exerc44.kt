package algoritmos;
import javax.swing.JOptionPane;

public class Algoritmos{
    public static void main(String[] args){
        int base,expoente,resultado;
        base=Integer.parseInt(JOptionPane.showInputDialog("Valor da base"));
        expoente=Integer.parseInt(JOptionPane.showInputDialog("Valor da potencia"));
        potencia(base,expoente);
        resultado=potencia(base,expoente);
        JOptionPane.showMessageDialog(null,"Resultado da potencia"+resultado);
    }

    public static int potencia(int b,int e){
        int resul,i;
        resul=1;
        for(i=1;i<=e;i++){
            resul=resul*b;
        }
        return resul;
    }
}