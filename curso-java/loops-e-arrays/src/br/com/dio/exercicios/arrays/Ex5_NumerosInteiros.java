package br.com.dio.exercicios.arrays;

import java.util.Scanner;

public class Ex5_NumerosInteiros {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] vet = new int[5];

        for (int i = 0; i < vet.length; i++){
            System.out.print("Digite o " + (i+1) + "º número: ");
            vet[i] = sc.nextInt();
        }

        System.out.println("Números digitados: ");
        for (int i = 0; i < vet.length; i++){
            System.out.print(vet[i] + " ");
        }


    }
}
