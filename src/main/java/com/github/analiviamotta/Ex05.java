package com.github.analiviamotta;

import java.util.Scanner;
/*
    Exercício 5: Você está responsável pelo bolo de aniversário da sua priminha e decidiu que o bolo terá uma
    vela para cada ano da idade total dela. Quando ela assopra as velas, ela só é capaz de apagar apenas as
    velas mais altas. Sua tarefa é fazer um programa que leia a idade A da sua sobrinha e a altura das velas.
    Após isso, seu programa deve imprimir a quantidade de velas que ela vai conseguir apagar.
    Por exemplo, se sua sobrina está fazendo 4 anos e o bolo possui 4 velas de tamanhos 4, 4, 1, 3, então ela
    só vai conseguir apagar as duas mais altas, de tamanho 4. Portanto, a resposta deve ser 2. Exemplos de
    entrada e saída:
    EntradaSaída
    4 2
    4
    4
    1
    3
    EntradaSaída
    4 2
    3
    2
    1
    3
    * Exercício gentilmente cedido pelos profs. Jorge Cutigi e Adenilso Simão (ICMC/USP)
 */
public class Ex05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int age = scanner.nextInt();
        int[] candles = new int[age];

        for (int i = 0; i < age; i++) {
            candles[i] = scanner.nextInt();
        }

        final Ex05 ex05 = new Ex05();
        System.out.println(ex05.computeNumberOfBlowoutCandles(age, candles));

    }

    public int computeNumberOfBlowoutCandles(int age, int[] candles){

        if(age<0) throw new IllegalArgumentException("Age cannot be negative");

        for (int candle : candles) {
              if (candle < 0) throw new IllegalArgumentException("Candle size cannot be negative");
        }

        if(age == 0) return 0;

        int maxCandleSize = 0;
        int numberOfCandlesBlown = 0;

        for (int candle : candles) {
          if (candle > maxCandleSize) maxCandleSize = candle;
        }

        for (int candle : candles) {
          if (candle == maxCandleSize) numberOfCandlesBlown++;
        }

        return numberOfCandlesBlown;
    }


}
