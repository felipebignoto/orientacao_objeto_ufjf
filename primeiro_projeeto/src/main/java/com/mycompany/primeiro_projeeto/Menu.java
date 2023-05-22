package com.mycompany.primeiro_projeeto;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Menu {

    public static void main() {
        //Scanner teclado = new Scanner(System.in);
        double memoria = 0;
        int operacao;
        do {
            System.out.println("Memoria = " + memoria);
            System.out.println();
            operacao = leOperacao();
            double valor;

            switch (operacao) {
                case 1:
                    valor = leDouble();
                    memoria = operacoes.soma(memoria, valor);
                    break;

                case 2:
                    valor = leDouble();
                    memoria = operacoes.subtracao(memoria, valor);
                    break;

                case 3:
                    valor = leDouble();
                    memoria = operacoes.multiplicacao(memoria, valor);
                    break;

                case 4:
                    valor = leDouble();
                    try {
                        memoria = operacoes.divisao(memoria, valor);
                    } catch (divisaoZero ex) {
                        System.out.println(ex.getMessage());
                    }

                    break;

                case 5:
                    memoria = 0;
                    break;

                case 6:
                    System.out.println("saindo");
                    break;
                default:
                    System.out.println("invalido");
            }
        } while (operacao != 6);
    }

    public static double leDouble() {
        Scanner teclado = new Scanner(System.in);
        double valor = leDouble();
        System.out.println("digite um valor real");

        try {
            valor = teclado.nextDouble();

        } catch (InputMismatchException ex) {
            System.out.println("Valor invalido!");
            valor = leDouble();

        }

        return valor;
    }

    public static int leOperacao() {

        int operacao;
        Scanner teclado = new Scanner(System.in);

        System.out.println("1 - somar");
        System.out.println("2 - subtrair");
        System.out.println("3 - multiplicar");
        System.out.println("4 - dividir");
        System.out.println("5 - limpar");
        System.out.println("6 - sair");

        try {
            operacao = teclado.nextInt();

        } catch (InputMismatchException ex) {
            System.out.println("Valor invalido - nao eh inteiro!");
            operacao = leOperacao();

        }

        if (operacao < 1 || operacao > 6) {
            System.out.println("Intervalo invalido");
            operacao = leOperacao();
        }

        return operacao;
    }
}
