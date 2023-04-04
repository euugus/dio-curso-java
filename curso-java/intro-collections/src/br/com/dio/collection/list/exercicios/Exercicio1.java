package br.com.dio.collection.list.exercicios;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Exercicio1 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List <Double> temperatura = new ArrayList<>();

        double sum = 0;
        for (int i = 1; i <= 6; i++){
            System.out.print("Digite a temperatura do " + i + "° mês: ");
            double n = sc.nextDouble();
            temperatura.add(n);
            sum += n;
        }

        double media = sum/temperatura.size();

        System.out.println("Temperatura Semestral: " + temperatura);
        System.out.printf("Média das temperaturas: %.2f", media);
        System.out.println();

        for(int i = 0; i < temperatura.size(); i++){
            double temp = temperatura.get(i);
            if (temp > media){
                int index = i;
                switch (index){
                    case 0 :
                        System.out.println((index + 1) + " - Janeiro " + temp + "°C");
                        break;
                    case 1 :
                        System.out.println((index + 1) + " - Fevereiro " + temp + "°C");
                        break;
                    case 2 :
                        System.out.println((index + 1) + " - Março " + temp + "°C");
                        break;
                    case 3 :
                        System.out.println((index + 1) + " - Abril " + temp + "°C");
                        break;
                    case 4 :
                        System.out.println((index + 1) + " - Maio " + temp + "°C");
                        break;
                    case 5 :
                        System.out.println((index + 1) + " - Junho " + temp + "°C");
                        break;
                    default:
                        break;

                }
            }
        }
    }
}
