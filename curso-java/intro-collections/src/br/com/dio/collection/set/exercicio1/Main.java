package br.com.dio.collection.set.exercicio1;

import java.io.PrintStream;
import java.util.*;

public class Main {

    public static void main(String[] args) {

        Set<ArcoIris> arcoIris = new LinkedHashSet<>(){{
            add(new ArcoIris("Vermelho"));
            add(new ArcoIris("Laranja"));
            add(new ArcoIris("Amarelo"));
            add(new ArcoIris("Verde"));
            add(new ArcoIris("Azul"));
            add(new ArcoIris("Anil"));
            add(new ArcoIris("Violeta"));
        }};

        System.out.println("\nExiba todas as cores uma abaixo da outra: ");
        for (ArcoIris lista : arcoIris) System.out.println(lista);

        System.out.print("\nQuantidade de cores que o arco-íris tem: ");
        System.out.println(arcoIris.size());
        //Forma sem utilizar o .size
        /*Iterator<ArcoIris> iterator = arcoIris.iterator();
        int count = 0;
        while (iterator.hasNext()) {
            ArcoIris next = iterator.next();
            count++;
        }
        System.out.println(count);*/

        System.out.println("\nExiba as cores em ordem alfabética:");
        Set<ArcoIris> arcoIris1 = new TreeSet<>(new ComparatorCor());
        arcoIris1.addAll(arcoIris);
        for (ArcoIris lista : arcoIris1) System.out.print(lista.getCor() + "  ");

        System.out.println();
        System.out.println();

        System.out.println("Exiba as cores na ordem inversa da que foi informada:");
        Set<ArcoIris> arcoIris2 = new TreeSet<>(Collections.reverseOrder(new ComparatorCor()));
        arcoIris2.addAll(arcoIris);
        for (ArcoIris lista : arcoIris2) System.out.print(lista.getCor() + "  ");

        System.out.println();

        System.out.println("\nExiba todas as cores que começam com a letra 'v' ");
            for (ArcoIris cor : arcoIris) {
                if(cor.getCor().startsWith("V")) System.out.print(cor.getCor() + "  ");
        }

        System.out.println();

        System.out.println("\nRemova todas as cores que não começam com a letra 'v'");
        Iterator<ArcoIris> iterator = arcoIris.iterator();
        while (iterator.hasNext()){
            ArcoIris cor = iterator.next();
            if (!cor.getCor().startsWith("V")){
                iterator.remove();
                System.out.print(cor.getCor() + " ");
            }
        }

        System.out.println();
        System.out.println();

        System.out.println("Limpe o conjunto");
        arcoIris.clear();
        System.out.println(arcoIris);


        System.out.println("Confira se o conjunto está vazio: " + arcoIris.isEmpty());

    }

}
