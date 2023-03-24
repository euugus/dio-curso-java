package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class maior_posicao {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos numeros voce vai digitar? ");
        int n = sc.nextInt();

        double[] vet = new double[n];

        for (int i = 0; i < vet.length; i++){
            System.out.print("Digite um numero: ");
            vet[i] = sc.nextDouble();
        }

        double maior = 0;
        int maior_posicao = 0;

        for (int i = 0; i < vet.length; i++){
            if (vet[i] > maior){
                maior = vet[i];
                maior_posicao = i;
            }
        }

        System.out.printf("\nMAIOR VALOR = %.2f", maior);
        System.out.println("\nPOSICAO DO MAIOR VALOR = " + maior_posicao);


    }

}
