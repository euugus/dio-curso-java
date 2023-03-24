package application;

import entities.Banco;

import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Banco banco;

        System.out.print("Enter account number: ");
        int numberAccount = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter account holder: ");
        String holder = sc.nextLine();

        System.out.print("Is there na initial deposit (y/n)? ");
        char option = sc.next().charAt(0);

        if (option == 'y'){
            System.out.print("Enter initial deposit value: ");
            double response = sc.nextDouble();
            banco = new Banco(numberAccount, holder, response);
        }
        else {
            banco = new Banco(numberAccount, holder);
        }

        System.out.println();
        System.out.println("Account data: ");
        System.out.println(banco);

        System.out.println();
        System.out.print("Enter a deposit value: ");
        double deposit = sc.nextDouble();
        banco.deposit(deposit);

        System.out.println("Updated account data: ");
        System.out.println(banco);

        System.out.println();
        System.out.print("Enter a withdraw value: ");
        double withdraw = sc.nextDouble();
        banco.withdraw(withdraw);

        System.out.println("Updated account data: ");
        System.out.println(banco);

    }

}
