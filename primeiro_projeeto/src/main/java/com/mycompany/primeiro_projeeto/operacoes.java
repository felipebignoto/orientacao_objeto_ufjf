
package com.mycompany.primeiro_projeeto;


public class operacoes {
    
    public static double soma(double p1, double p2) {
        return p1 + p2;
    }
    
    public static double subtracao(double p1, double p2){
        return p1 - p2;
    }
    
    public static double multiplicacao(double p1, double p2){
        return p1 * p2;
    }

    public static double divisao(double p1, double p2) throws divisaoZero {
        if (p2 == 0) {
            throw new divisaoZero();
        }

        return p1 / p2;
    }
}
