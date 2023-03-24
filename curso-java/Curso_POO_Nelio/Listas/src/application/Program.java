package application;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Program {

    public static void main(String[] args) {

        //criar lista
        List<String> list = new ArrayList<>();

        list.add("Maria");
        list.add("Alex");
        list.add("Bob");
        list.add("Anna");
        list.add(2, "Marco");

        System.out.println(list.size());

        for (String x : list ){
            System.out.println(x);
        }

        System.out.println("----------------------");
        //remover
        list.removeIf(x -> x.charAt(0) == 'M');

        for (String x : list ){
            System.out.println(x);
        }

        System.out.println("----------------------");
        //encontrar posicao
        System.out.println("Index of BoB " + list.indexOf("Bob"));
        System.out.println("Index of BoB " + list.indexOf("Marco"));
        System.out.println("----------------------");
        //nomes que comecam com a letra
        List<String> result = list.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList());

        for (String x : result ){
            System.out.println(x);
        }

        System.out.println("----------------------");
        //filtrar nomes pela primeira letra
        String name = list.stream().filter(x -> x.charAt(0) == 'J').findFirst().orElse(null);
        System.out.println(name);

    }

}
