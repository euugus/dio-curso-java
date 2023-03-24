package app;

import exercicios.treino.Lista;

import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        //TYPE SAFETY

        List<String> list = new List<String>();

        list.add("Gustavo");
        list.add("Maria");

        System.out.println(list);
    }


}
