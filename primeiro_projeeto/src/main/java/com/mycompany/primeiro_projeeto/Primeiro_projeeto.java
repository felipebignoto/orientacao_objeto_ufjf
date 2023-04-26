/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.primeiro_projeeto;


/**
 *
 * @author felip
 */
public class Primeiro_projeeto {

    public static void main(String[] args) {
        System.out.println("  World!");
        Pilha<Integer> pilhainteiro = new Pilha<>();
        
        System.out.println("Eh vazia: " + pilhainteiro.ehVazia());
        pilhainteiro.empilha(1);
        pilhainteiro.empilha(2);
        pilhainteiro.empilha(3);
        System.out.println("Eh vazia: " + pilhainteiro.ehVazia());
        pilhainteiro.desempilha();
        pilhainteiro.desempilha();
        pilhainteiro.desempilha();
        System.out.println("Eh vazia: " + pilhainteiro.ehVazia());
        
    }
}
