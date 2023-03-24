package Exercicio;

import java.util.Locale;
import java.util.Scanner;

public class ExSomaDiagonalPrincipal {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Qual a ordem da matriz: ");
        int n = sc.nextInt();

        double[][] mat = new double[n][n];

        System.out.println("Digite os valores da matriz:");
        for (int i = 0; i < mat.length; i++){
            for (int j = 0; j < mat[i].length; j++){
                mat[i][j] = sc.nextDouble();
            }
        }

        double soma = 0.0;
        for (int i = 0; i < mat.length; i++){
            soma += mat[i][i];
        }

        System.out.printf("Soma da diagonal principal = %.1f%n", soma);

    }

}

