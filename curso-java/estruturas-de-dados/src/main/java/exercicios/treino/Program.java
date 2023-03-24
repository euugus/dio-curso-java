package exercicios.treino;

import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Lista lista = new Lista();

        int opcao;

        do{
            showMenu();
            opcao = sc.nextInt();

            switch(opcao){
                case 1: {
                    System.out.print("Digite um número: ");
                    double value = sc.nextDouble();
                    lista.adicionar(value);
                    break;
                }
                case 2: {
                    System.out.println(lista.toString());
                    break;
                }
                case 3: {
                    System.out.println("Opção Inválida");
                }

                default:
                    System.out.println("Opção Inválida");
                }

        }while(opcao != 3);

        sc.close();

    }

    public static void showMenu(){
        System.out.println("1 - Inserir salário na lista: ");
        System.out.println("2 - Mostrar lista: ");
        System.out.println("3 - Sair: ");
    }


}
