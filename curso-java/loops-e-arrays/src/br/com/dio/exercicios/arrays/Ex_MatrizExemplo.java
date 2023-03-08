package br.com.dio.exercicios.arrays;

import java.util.Locale;
import java.util.Scanner;

public class Ex_MatrizExemplo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Quantas linhas vai ter a matriz? ");
        int linhas = sc.nextInt();
        System.out.print("Quantas colunas vai ter a matriz? ");
        int colunas = sc.nextInt();

        int[][] matriz = new int[linhas][colunas];

        for (int i = 0; i < linhas; i++){
            for (int j = 0; j < colunas; j++){
                System.out.print("Elemento [" + i + "," + j + "]: ");
                matriz[i][j] = sc.nextInt();
            }
        }

        System.out.println();
        System.out.println("MATRIZ DIGITADA:");
        for (int i = 0; i < linhas; i++){
            for (int j = 0; j < colunas; j++){
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }

        sc.close();
    }

}
