/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.primeiro_projeeto;
import java.util.ArrayList;
/**
 *
 * @author felip
 */
public class Pilha<T> {
    private ArrayList<T> pilha;
    
    public Pilha(){
        this.pilha = new ArrayList<>();
             
    }
    
    public void empilha(T elemento){
        pilha.add(elemento);
    }
    
    public T desempilha(){
        if(pilha.size() > 0){
            return pilha.remove(pilha.size() -1);
        }
        
        else{
            return null;
        }
    }
    
    public boolean ehVazia(){
        return pilha.isEmpty();
    }
    
 
    
}
