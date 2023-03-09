package algoritmos;

import java.util.*;
public class Algoritmos{
    public static void main(String[] args){
        int tempo, velocidade;
        float litros_gastos;
        Scanner e=new Scanner(System.in);
        System.out.println("Tempo de percurso por hora:");
        tempo=e.nextInt();
        System.out.println("Velocidade media:");
        velocidade=e.nextInt();
        litros_gastos=(tempo*velocidade)/12;
        System.out.println("Quantidade de litros gastos:"+litros_gastos);
    }
}