import javax.swing.JOptionPane;
public class Main {
    public static void main(String[] args) {
        int menu = 0;
        int retirada_valor, valor, banco, qnt_notas, notas;
        int nota2 = 6, nota5 = 6, nota10 = 6, nota20 = 6, nota50 = 6, nota100 = 6;
        int maior_valor=0,menor_valor=0,valor_total=0,sobra;
        double media=0,cta=1;
        while (menu != 9|cta==100) {
            if (nota2 == 0 & nota5 == 0 & nota10 == 0 & nota20 == 0 & nota50 == 0 & nota100 == 0) {
                JOptionPane.showMessageDialog(null, "Nao ha mais notas disponiveis");
            } else {
                menu = Integer.parseInt(JOptionPane.showInputDialog("Menu Principal\n1-Carregar Notas\n2-Retirar Notas\n3-Estatistica\n9-Fim"));
                if (menu == 1) {
                    JOptionPane.showMessageDialog(null, "Qnt de notas de 2: " + nota2 + "\nQnt de notas de 5: " + nota5 + "\nQnt de notas de 10: " + nota10 + "\nQnt de notas de 20: " + nota20 + "\nQnt de notas de 50: " + nota50 + "\nQnt de notas de 100: " + nota100);
                    menu = 0;
                }
                if (menu == 2) {
                    banco = Integer.parseInt(JOptionPane.showInputDialog("Insira o codigo do banco\n1-Banco do Brasil\n2-Santader\n3-Itau\n4-Caixa"));
                    retirada_valor = Integer.parseInt(JOptionPane.showInputDialog("Valor que deseja retirar"));
                    qnt_notas = Integer.parseInt(JOptionPane.showInputDialog("Quantidade aproximada de notas do valor que deseja ser retirado"));
                    valor = retirada_valor;
                    notas = qnt_notas;
                    valor_total=valor_total+retirada_valor;
                    if(cta==1|menor_valor==0){
                        menor_valor=retirada_valor;
                    }
                    if (maior_valor<retirada_valor){
                        maior_valor=retirada_valor;
                    }
                    if (menor_valor>retirada_valor){
                        menor_valor=retirada_valor;
                    }
                    System.out.println("----");
                    while (notas>0) {
                        if (valor==1|valor>nota2*2+nota5*5+nota10*10+nota20*20+nota50*50+nota100*100) {
                            JOptionPane.showMessageDialog(null, "Excedeu o limite do caixa");
                            maior_valor=0;
                            menor_valor=0;
                            valor_total=0;
                            notas=-1;
                        } else {
                            if ((valor >= 100)&(valor/notas>50)&(nota100>0)) {
                                nota100 = nota100 - 1;
                                valor = valor - 100;
                                System.out.println("100");
                                notas = notas - 1;
                            }else if ((valor >= 50)&(valor/notas>20)&(nota50>0) ) {
                                nota50 = nota50 - 1;
                                valor = valor - 50;
                                System.out.println("50");
                                notas = notas - 1;
                            }else if (valor >= 20 &(valor/notas>10)&(nota20>0)) {
                                nota20 = nota20 - 1;
                                valor = valor - 20;
                                System.out.println("20");
                                notas = notas - 1;
                            }else if (valor >= 10 &(valor/notas>5)&(nota10>0) ) {
                                nota10 = nota10 - 1;
                                valor = valor - 10;
                                System.out.println("10");
                                notas = notas - 1;
                            }else if (valor>=5 &(valor/notas>2)&(nota5>0) ) {
                                nota5=nota5-1;
                                valor=valor-5;
                                System.out.println("5");
                                notas=notas-1;
                            }else if ((valor >= 2 &valor<5 )&(nota2>0)){
                                nota2 = nota2 - 1;
                                valor = valor - 2;
                                System.out.println("2");
                                notas = notas - 1;
                            }
                        }
                    }while(valor>1) {
                        if (valor >= 100) {
                            nota100 = nota100 - 1;
                            valor = valor - 100;
                            System.out.println("100");
                        } else if (valor >= 50) {
                            nota50 = nota50 - 1;
                            valor = valor - 50;
                            System.out.println("50");
                        } else if (valor >= 20) {
                            nota20 = nota20 - 1;
                            valor = valor - 20;
                            System.out.println("20");
                        } else if (valor >= 10) {
                            nota10 = nota10 - 1;
                            valor = valor - 10;
                            System.out.println("10");
                        } else if (valor >= 5) {
                            nota5 = nota5 - 1;
                            valor = valor - 5;
                            System.out.println("5");
                        } else if (valor >= 2) {
                            nota2 = nota2 - 1;
                            valor = valor - 2;
                            System.out.println("2");
                        }
                    }
                    System.out.println("----");
                    cta=cta+1;
                }
                if(menu==3){
                    sobra=nota2*2+ nota5*5 +  nota10*10 + nota20 *20 + nota50*50 + nota100*100;
                    media=valor_total/cta;
                    System.out.println("-------------------------\nMaior valor sacado: "+maior_valor+"\nMenor valor sacado: "+menor_valor+"\nMedia dos saques: "+media+"\nValor total dos saques: "+valor_total+"\nSobra do caixa: "+sobra+"\n-------------------------");
                }
            }
        }
    }
}