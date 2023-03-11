package algoritmos;
import javax.swing.JOptionPane;

public class Algoritmos{
    public static void main(String[] args){
        float preco,vendas;
        preco=Integer.parseInt(JOptionPane.showInputDialog("Informe o preco atual do produto"));
        vendas=Integer.parseInt(JOptionPane.showInputDialog("Informe as vendas mensais"));
        if (vendas<500 & preco<30){
            preco=preco+(preco*1/10);
        }
        if (vendas>=500 & vendas<1000 & preco>=30 & preco<80){
            preco=preco+(preco*15/100);
        }
        if (vendas>=1000 & preco>=80){
            preco=preco-(preco*5/100);
        }
        JOptionPane.showMessageDialog(null,"Novo preco:"+preco);
    }
}