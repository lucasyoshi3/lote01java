package algoritmos;

import javax.swing.JOptionPane;
public class Algoritmos{
    public static void main(String[] args){
        int lado=Integer.parseInt(JOptionPane.showInputDialog("Digite lado"));
        double area;
        area= lado * lado;
        System.out.println("A area e"+area);

    }



}