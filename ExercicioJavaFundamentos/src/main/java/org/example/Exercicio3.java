package org.example;
/*
Criar um programa que calcule a média de salários de uma empresa,
pedindo ao usuário a grade de funcionários e os salários,
e devolvendo a média salarial.Vamos declarar as variáveis de quatro salários dos funcionários e da
média como double e definir alguns valores para cada um dos salários. Em seguida,
vamos calcular a média dos mesmos, para isso, basta somar todos os salários e dividir pela quantidade de
funcionários (que serão 4).
Para finalizar, é só exibir a média na tela!
 */
public class Exercicio3 {
    public static void main(String[]args){
      double s1, s2, s3, s4, media;

      s1 = 400;
      s2 = 365.5;
      s3 = 1000.5;
      s4 = 5000.6;

      media = s1 + s2 + s3 + s4 /4;

        System.out.print("A média salarial da empresa é de R$: " + media);
    }

}
