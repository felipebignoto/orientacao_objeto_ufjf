/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.primeiro_projeeto;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 *
 * @author felip
 */
public class testeSet {
    public void main() {
         System.out.println("digite a frase");
        Scanner teclado = new Scanner(System.in);
        String frase = teclado.nextLine();
        int j = 0;
        int palavrasNaoRepetidas = 0;
        Set<String> palavras = new HashSet<>();
        
        
        for(int i = 0; i<frase.length();i++){
            j = frase.indexOf(" " , i);
            
            if( j> 0){
               if(palavras.contains(frase.substring(i, j))){
                   //ja ta cadastrada
               }
               else{
                   palavrasNaoRepetidas++;
                   palavras.add(frase.substring(i, j));
               }
            }
            i=j;
        }
        
       System.out.println(palavrasNaoRepetidas);
        
        
    }
}
