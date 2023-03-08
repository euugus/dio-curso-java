package br.com.dio.exercicios.loops;

import java.util.Scanner;

public class Ex4_ParEImpar {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int quantNumeros;
        int numero;
        int quantPares = 0, quantImpares = 0;
        int count = 0;

        System.out.println("Quantidade de números: ");
        quantNumeros = sc.nextInt();

        do {
            System.out.println("Número: ");
            numero = sc.nextInt();

            if (numero % 2 == 0)
                quantPares++;
            else
                quantImpares++;

            count++;
        }while(count < quantNumeros);

        System.out.println("Quantidade de pares: " + quantPares);
        System.out.println("Quantidade de impares: " + quantImpares);


    }

}
