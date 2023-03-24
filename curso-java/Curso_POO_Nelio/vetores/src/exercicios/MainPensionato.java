package exercicios;

import entities.Pensionato;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class MainPensionato {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Pensionato[] vet = new Pensionato[10];

        System.out.print("How many rooms will be rented? ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++){
            System.out.println("\nRent #" + i + ":");
            System.out.print("Name: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("Email: ");
            String email = sc.nextLine();
            System.out.print("Room: ");
            int room = sc.nextInt();

            vet[room] = new Pensionato(name, email);
        }

        System.out.println();
        System.out.println("Busy rooms:");
        for (int i = 0; i < vet.length; i++){
            if (vet[i] != null){
                System.out.println(i + ": " + vet[i]);
            }
        }

        sc.close();
    }

}
