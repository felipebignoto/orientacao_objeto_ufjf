/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.primeiro_projeeto;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Prova1Questao2 {
    public  void main() {
        Scanner teclado = new Scanner(System.in);
        
        Map <Character, Integer> quantidadeCaracteres = new HashMap();
        System.out.println("digite a frase");
        String frase = teclado.nextLine();
        Character c;
        
        for(int i =0; i< frase.length(); i++){
            c =frase.charAt(i);
            
            if(quantidadeCaracteres.keySet().contains(c)){
                quantidadeCaracteres.put(c,quantidadeCaracteres.get(c) +1);
            }
            else{
                quantidadeCaracteres.put(c,1);
            }
        }
        
        for (Character character : quantidadeCaracteres.keySet()) {
            System.out.println(character+" ===> " + 
                    quantidadeCaracteres.get(character));
        }
    }
}
