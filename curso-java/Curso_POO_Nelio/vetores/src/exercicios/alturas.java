package exercicios;

import entities.Pessoa;

import java.util.Locale;
import java.util.Scanner;

public class alturas {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantas pessoas serao digitadas? ");
        int n = sc.nextInt();

        Pessoa[] vet = new Pessoa[n];

        for (int i = 0; i < vet.length; i++){
            System.out.printf("Dados da %dª pessoa: \n", i + 1);
            sc.nextLine();
            System.out.print("Nome: ");
            String nome = sc.nextLine();
            System.out.print("Idade: ");
            int idade = sc.nextInt();
            System.out.print("Altura: ");
            double altura = sc.nextDouble();
            vet[i] = new Pessoa(nome, idade, altura);
        }

        System.out.println();

        double soma = 0;
        int nmenores = 0;

        for (int i = 0; i < vet.length; i++) {
            if(vet[i].getIdade() < 16){
                int idade = vet[i].getIdade();
                nmenores++;
            }
            soma += vet[i].getAltura();
        }

        double media = soma / vet.length;
        double percentualMenores = ((double)nmenores / vet.length) * 100.0;

        System.out.printf("Altura média: %.2f\n", media);
        System.out.printf("Pessoas com menos de 16 anos: %.1f%%\n", percentualMenores);

        for (int i = 0; i < vet.length; i++){
            if (vet[i].getIdade() < 16){
                System.out.printf("%s\n", vet[i].getNome());
            }
        }

        sc.close();
    }


}
