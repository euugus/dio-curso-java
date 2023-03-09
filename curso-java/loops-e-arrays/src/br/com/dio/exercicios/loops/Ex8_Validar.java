package br.com.dio.exercicios.loops;

import java.util.Scanner;

public class Ex8_Validar {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Nome: ");
        String nome = sc.next();
            while (nome.length() <= 3){
                System.out.println("Tamanho do nome inválido. Digite novamente");
                nome = sc.next();
            }

        System.out.print("Idade: ");
        int idade = sc.nextInt();
            while (idade < 0 || idade >150){
                System.out.print("Idade inválida. Digite novamente: ");
                idade = sc.nextInt();
            }

        System.out.print("Salário: ");
        double salario = sc.nextDouble();
            while (salario <= 0 ){
                System.out.print("Salário iválido. Digite novamente: ");
                salario = sc.nextDouble();
            }

        System.out.print("Sexo: ");
        char sexo = sc.next().charAt(0);
            while (sexo != 'f' && sexo !='m'){
                System.out.println("Sexo inválido. Digite novamente");
                sexo = sc.next().charAt(0);
            }

        System.out.print("Estado civil: ");
        char estado = sc.next().charAt(0);
            while (estado != 's' && estado != 'c' && estado != 'v' && estado != 'd'){
                System.out.println("Estado civil inválido: Digite novamente");
                estado = sc.next().charAt(0);
            }

    }

}
