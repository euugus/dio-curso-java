package br.com.dio.exercicios.loops;

import java.util.Scanner;

public class Ex7_UsuarioSenha {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String nome, senha;

        System.out.println("Nome: ");
        nome = sc.next();
        System.out.println("Senha");
        senha = sc.next();

        while(nome.equals(senha)){
            System.out.println("Informe outra senha");
            senha = sc.next();
        }

        if (senha != nome){
            System.out.println("Cadastrado");
        }

        sc.close();
    }
}
