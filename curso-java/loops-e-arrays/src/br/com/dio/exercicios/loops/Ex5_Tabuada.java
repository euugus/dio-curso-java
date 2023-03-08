package br.com.dio.exercicios.loops;

import java.util.Scanner;

public class Ex5_Tabuada {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Tabuada: ");
        int tabuada = sc.nextInt();

        System.out.println("Tabuada de " + tabuada);
        for (int i = 1; i <= 10; i++) {
            System.out.println(tabuada + " X " + i + " = " + (tabuada * i));
        }
    }
}

//MESMO EXERCÍCIO UTILIZANDO LAÇO WHILE

        /*Scanner sc = new Scanner(System.in);

        System.out.println("Informe dois números para tabuada: ");
        int x = sc.nextInt();
        int y = sc.nextInt();

        while (x > 0 && y <= 10){
            System.out.println("Resultado de " + x + " X " + y + " = " + (x * y));
            System.out.println("Informe dois números para tabuada: ");
            x = sc.nextInt();
            y = sc.nextInt();

        }

        System.out.println("Número inválido");*/