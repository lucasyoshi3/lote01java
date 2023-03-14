import javax.swing.JOptionPane;
public class caixa {
    public static void main(String[] args) {
        int menu = 0;
        String qnt_notas;
        int retirada_valor, banco, i, total_retirado = 0, sobra;
        int nota2 = 6, nota5 = 6, nota10 = 6, nota20 = 6, nota50 = 6, nota100 = 6, nota200 = 6;
        int maior_valor = 0, menor_valor = 0, valor_total = 0, controle_retirado;
        double media = 0, cta = 1;
        while (menu != 9 | cta == 100) {
            if (nota2 == 0 & nota5 == 0 & nota10 == 0 & nota20 == 0 & nota50 == 0 & nota100 == 0) {
                JOptionPane.showMessageDialog(null, "Nao ha mais notas disponiveis");
            } else {
                menu = Integer.parseInt(JOptionPane.showInputDialog("Menu Principal\n1-Carregar Notas\n2-Retirar Notas\n3-Estatistica\n9-Fim"));
                if (menu == 1) {
                    JOptionPane.showMessageDialog(null, "Qnt de notas de 2: " + nota2 + "\nQnt de notas de 5: " + nota5 + "\nQnt de notas de 10: " + nota10 + "\nQnt de notas de 20: " + nota20 + "\nQnt de notas de 50: " + nota50 + "\nQnt de notas de 100: " + nota100 + "\nQnt de notas de 200: " + nota200);
                    menu = 0;
                }
                if (menu == 2) {
                    banco = Integer.parseInt(JOptionPane.showInputDialog("Insira o codigo do banco\n1-Banco do Brasil\n2-Santader\n3-Itau\n4-Caixa"));
                    valor_total = 0;
                    retirada_valor = Integer.parseInt(JOptionPane.showInputDialog("Valor que deseja retirar"));
                    total_retirado += retirada_valor;
                    controle_retirado = 0;
                    cta += 1;
                    while (controle_retirado < (retirada_valor)) {
                        qnt_notas = JOptionPane.showInputDialog("Quantidade eo valor das notas que deseja ser retirado.\nExemplo: 2x200 para retirar 400.\nSe desejar retirar a menor quantidade de notas digite '1x1'.");
                        String[] notas = qnt_notas.split("x");
                        String numero = notas[0];
                        String valor = notas[1];
                        int numero_de_notas = Integer.parseInt(numero);
                        int valor_das_notas = Integer.parseInt(valor);
                        if ((numero_de_notas == 1 & valor_das_notas == 1) | valor_das_notas == 1) {
                            while (controle_retirado < retirada_valor) {
                                if (controle_retirado + 200 <= retirada_valor & nota200 != 0) {
                                    System.out.println("200");
                                    nota200 -= 1;
                                    controle_retirado += 200;
                                } else if ((controle_retirado + 100 <= retirada_valor | nota200 == 0) & nota100 != 0) {
                                    System.out.println("100");
                                    nota100 -= 1;
                                    controle_retirado += 100;
                                } else if ((controle_retirado + 50 <= retirada_valor | nota100 == 0) & nota50 != 0) {
                                    System.out.println("50");
                                    nota50 -= 1;
                                    controle_retirado += 50;
                                } else if ((controle_retirado + 20 <= retirada_valor | nota50 == 0) & nota20 != 0) {
                                    System.out.println("20");
                                    nota20 -= 1;
                                    controle_retirado += 20;
                                } else if ((controle_retirado + 10 <= retirada_valor | nota20 == 0) & nota10 != 0) {
                                    System.out.println("10");
                                    nota10 -= 1;
                                    controle_retirado += 10;
                                } else if ((controle_retirado + 5 <= retirada_valor | nota10 == 0) & nota5 != 0) {
                                    System.out.println("5");
                                    nota5 -= 1;
                                    controle_retirado += 5;
                                } else if ((controle_retirado + 2 <= retirada_valor | nota5 == 0) & nota2 != 0) {
                                    System.out.println("2");
                                    nota2 -= 1;
                                    controle_retirado += 2;
                                }
                            }
                        } else {
                            if ((numero_de_notas * valor_das_notas) > (retirada_valor - controle_retirado)) {
                                JOptionPane.showMessageDialog(null, "O quantidade de notas escolhida supera o valor que vai ser retirado");
                            } else {
                                for (i = 1; i <= numero_de_notas; i++) {
                                    if ((valor_das_notas == 200 & nota200 == 0) | (valor_das_notas == 100 & nota100 == 0) | (valor_das_notas == 50 & nota50 == 0) | (valor_das_notas == 20 & nota20 == 0) | (valor_das_notas == 10 & nota10 == 0) | (valor_das_notas == 5 & nota5 == 0) | (valor_das_notas == 2 & nota2 == 0)) {
                                        JOptionPane.showMessageDialog(null, "Notas indisponiveis");
                                        i = numero_de_notas + 1;
                                    } else {
                                        switch (valor_das_notas) {
                                            case (200):
                                                System.out.println("200");
                                                nota200 = nota200 - 1;
                                                controle_retirado += 200;
                                                break;
                                            case (100):
                                                System.out.println("100");
                                                nota100 = nota100 - 1;
                                                controle_retirado += 100;
                                                break;
                                            case (50):
                                                System.out.println("50");
                                                nota50 = nota50 - 1;
                                                controle_retirado += 50;
                                                break;
                                            case (20):
                                                System.out.println("20");
                                                nota20 = nota20 - 1;
                                                controle_retirado += 20;
                                                break;
                                            case (10):
                                                System.out.println("10");
                                                nota10 = nota10 - 1;
                                                controle_retirado += 10;
                                                break;
                                            case (5):
                                                System.out.println("5");
                                                nota5 = nota5 - 1;
                                                controle_retirado += 5;
                                                break;
                                            case (2):
                                                System.out.println("2");
                                                nota2 = nota2 - 1;
                                                controle_retirado += 2;
                                                break;
                                            default:
                                                System.out.println("Valor da nota invalida.");
                                                break;
                                        }
                                    }
                                }
                            }
                        }
                    }
                    if (cta == 1 | menor_valor == 0) {
                        menor_valor = retirada_valor;
                    }
                    if (maior_valor < retirada_valor) {
                        maior_valor = retirada_valor;
                    }
                    if (menor_valor > retirada_valor) {
                        menor_valor = retirada_valor;
                    }
                    System.out.println("----");

                }
                if (menu == 3) {
                    sobra = nota2 * 2 + nota5 * 5 + nota10 * 10 + nota20 * 20 + nota50 * 50 + nota100 * 100 + nota200 * 200;
                    media = total_retirado / (cta - 1);
                    System.out.println("-------------------------\nMaior valor sacado: " + maior_valor + "\nMenor valor sacado: " + menor_valor + "\nMedia dos saques: " + media + "\nValor total dos saques: " + total_retirado + "\nSobra do caixa: " + sobra + "\n-------------------------");
                }
            }
        }
    }
}