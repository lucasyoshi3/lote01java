package algoritmos;

import javax.swing.JOptionPane;

public class Algoritmos{
    public static void main(String[] args){
        int an=Integer.parseInt(JOptionPane.showInputDialog("Digite o ano de nascimento"));
        int at=Integer.parseInt(JOptionPane.showInputDialog("Digite o ano atual"));
        float idade;
        float idadedaqui;
        idade=at-an;
        idadedaqui=idade+17;
        System.out.println("A idade da pessoa e:"+idade);
        System.out.println("A idade da pessoa daqui 17 anos:"+idadedaqui);
    }
}