package com.mycompany.exercicio22;
public class Exercicio22 {
    public static void main(String[] args) {
        int num = 0;
        int total = 1;
        while(total<=1000){
            num += total;
            total++;
        }
        double media = num / (double)1000;
        System.out.println("Média: "+media);
    }
}
