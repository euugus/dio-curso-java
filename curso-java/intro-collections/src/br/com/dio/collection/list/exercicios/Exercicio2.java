package br.com.dio.collection.list.exercicios;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Exercicio2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        List<String> lista = new ArrayList<>();

        String resp;
        System.out.print("Telefonou para a vítima?");
        resp = sc.nextLine();
        lista.add(resp);
        System.out.print("Esteve no local do crime?");
        resp = sc.nextLine();
        lista.add(resp);
        System.out.print("Esteve no local do crime?");
        resp = sc.nextLine();
        lista.add(resp);
        System.out.print("Devia para a vítima?");
        resp = sc.nextLine();
        lista.add(resp);
        System.out.print("Devia para a vítima?");
        resp = sc.nextLine();
        lista.add(resp);

        int count = 0;
        Iterator<String> cont = lista.iterator();
        while (cont.hasNext()){
            String resposta = cont.next();
            if (resposta.contains("s")){
                count ++;
            }
        }

        switch (count){
            case 2:
                System.out.println("Suspeita");
                break;
            case 3:
            case 4:
                System.out.println("Cúmplice");
                break;
            case 5:
                System.out.println("Assasina");
                break;
            default:
                System.out.println("Inocente");
                break;
        }
    }
}
