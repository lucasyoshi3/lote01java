package algoritmos;

import java.util.Scanner;
public class Algoritmos{
    
    public static void main(String args[]){
        int horas_trabalhadas, valor_hora, descendentes;
        float desconto, bruto, liquido;
        Scanner e=new Scanner(System.in);
        System.out.println("Numero de horas trabalhadas:");
        horas_trabalhadas=e.nextInt();
        System.out.println("Valor por hora trabalhada:");
        valor_hora=e.nextInt();
        System.out.println("Percentual de desconto:");
        desconto=e.nextInt();
        desconto=desconto/100;
        System.out.println("Numero de descendentes:");
        descendentes=e.nextInt();
        bruto=horas_trabalhadas*valor_hora;
        liquido=(bruto-(bruto*desconto))+(descendentes*100);
        System.out.println("Salario bruto:"+ bruto);
        System.out.println("Salario liquido:"+ liquido);
    }
}