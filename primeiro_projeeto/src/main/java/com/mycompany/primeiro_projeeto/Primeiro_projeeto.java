/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.primeiro_projeeto;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 *
 * @author felip
 */
public class Primeiro_projeeto {
    //private final int TAMANHO_MAXIMO = 9;
    public static void main(String[] args) {
        
        List<Animal> animais = new ArrayList<>();
        animais.add(new Cao());
        animais.add(new gato());
        animais.add(new gato());
        animais.add(new Cao());
        animais.add(new humano());
        
        for(Animal animal:animais){
            System.out.println(animal.fala());
        }
        
        
        
        ////////////Testes de outros exercicios////////////
        //System.out.println("  World!");
        //chamaPilha();
        //chamaScannerTeste();
       //prova1();
       //teste();
    }
       
    public static void chamaPilha() {
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

    private static void chamaScannerTeste() {
        ScannerTeste s = new ScannerTeste();
        s.main();
    }
    
    private static  void prova1(){
        Prova1Questao2 prova1q2 = new Prova1Questao2();
        prova1q2.main();
    }
    
    private static  void teste(){
        testeSet t = new testeSet();
        t.main();
    }
}
