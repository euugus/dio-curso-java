package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class media_pares {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos elementos vai ter o vetor? ");
        int n = sc.nextInt();

        int[] vet = new int[n];

        int somapares = 0, npares = 0;

        for (int i = 0; i < vet.length; i++) {
            System.out.print("Digite um numero: ");
            vet[i] = sc.nextInt();
        }

        for (int i = 0; i < vet.length; i++){
            if (vet[i] % 2 == 0){
                somapares = somapares + vet[i];
                npares++;
            }
        }

        if (npares == 0){
            System.out.println("NENHUM NUMERO PAR");
        } else{
            double media = (double)somapares / npares;
            System.out.printf("MEDIA DOS PARES: %.1f\n", media);
        }



        sc.close();
    }

}
