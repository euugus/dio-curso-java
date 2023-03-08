package br.com.dio.exercicios.loops;

import java.util.Scanner;

public class Ex1_NomeEIdade {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Digite o nome do aluno: ");
            String nome = scanner.next();
            if (nome.equals("0")) break;

            System.out.println("Digite a idade do aluno: ");
            int idade = scanner.nextInt();
        }

        System.out.println("Continua aqui...");

    }
}
