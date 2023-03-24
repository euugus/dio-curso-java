package application;

import entities.CurrencyConverter;

import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        CurrencyConverter cc = new CurrencyConverter();

        System.out.print("What is the dollar price? ");
        cc.priceDollar = sc.nextDouble();
        System.out.print("How many dollars will be bought? ");
        cc.priceReal = sc.nextDouble();

        System.out.printf("Amount to be paid in reais = %.2f", cc.calc());

    }

}
