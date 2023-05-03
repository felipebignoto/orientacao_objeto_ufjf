/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.primeiro_projeeto;

import java.util.Scanner;

/**
 *
 * @author felip
 */
public class ScannerTeste {
    public static void main() {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Entre com um número: ");
        double numero = teclado.nextDouble();
        if (numero < 0) {
            numero = -numero;
        }
        System.out.println("Valor absoluto: " + numero);
    }
}