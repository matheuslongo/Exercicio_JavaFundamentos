package org.example;
/*
1. Escreva um programa que, com base em uma temperatura em graus celsius,
a converta e exiba em Kelvin (K), Réaumur (Re), Rankine (Ra) e Fahrenheit (F),
seguindo as fórmulas: F = C * 1.8 + 32; K = C + 273.15; Re = C * 0.8; Ra = C * 1.8 + 32 + 459.67


 */
public class Exercicios {
    public static void main(String[]args){
        double f, c, k, Re, Ra ;
        c = 2.3;

        f = c * 1.8;
        k = c + 273.15;
        Re =c * 0.8;
        Ra = c * 1.8 + 32 + 459.67;

        System.out.println("A temperatura em Fahrenheit é: " + f);
        System.out.println("A temperatura em Kelvin é: " + k);
        System.out.println("A temperatura em Reaumur é: " + Ra);
        System.out.println("A temperatura em Rankine é: " + Re);




    }
}
