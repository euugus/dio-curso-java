package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class soma_vetor {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos numeros voce vai digitar? ");
        int n = sc.nextInt();

        double[] vet = new double[n];

        for (int i = 0; i < vet.length; i++){
            System.out.print("Digite um número: ");
            vet[i] = sc.nextDouble();
        }

        System.out.println();

        double soma = 0;
        double media = 0;

        System.out.printf("VALORES = ");
        for (int i = 0; i < vet.length; i++){
            System.out.printf("%.1f  ", vet[i]);
            soma += vet[i];
            media = soma / n;
        }

        System.out.printf("\nSOMA = %.2f%n", soma);
        System.out.printf("MEDIA = %.2f%n", media);

        sc.close();
    }

}
