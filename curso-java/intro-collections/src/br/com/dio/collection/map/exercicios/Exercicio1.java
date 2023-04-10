package br.com.dio.collection.map.exercicios;

import java.util.*;

public class Exercicio1 {

    public static void main(String[] args) {

        System.out.println("Crie um dicionário e relacione os estados e suas populações:");
        Map<String, Integer> estadosPopulacao = new HashMap<>(){{
           put("PE", 9616621);
           put("AL", 3351543);
           put("CE", 9187103);
           put("RN", 3534265);
        }};
        System.out.println(estadosPopulacao + " ");

        System.out.println("Substitua a poupulação do estado do RN por 3.534.165");
        estadosPopulacao.put("RN", 3534165);
        System.out.println(estadosPopulacao + " ");

        System.out.println("Confira se o estado PB está no dicionário, caso não, adicione: PB - 4039277");
        estadosPopulacao.put("PB", 4039277);
        System.out.println(estadosPopulacao);

        System.out.println("Exiba a população de PE: " + estadosPopulacao.get("PE"));

        System.out.println("Exiba todos os estados e suas populações na ordem que foi informado:");
        Map<String, Integer> estadosPopulacao2 = new LinkedHashMap<>(){{
            put("PE", 9616621);
            put("AL", 3351543);
            put("CE", 9187103);
            put("RN", 3534265);
            put("PB", 4039277);
        }};
        System.out.println(estadosPopulacao2 + " ");

        System.out.println("Exiba os estados e suas populações em ordem alfabética:");
        Map<String, Integer> estadosPopulacao3 = new TreeMap<>(estadosPopulacao2);
        System.out.println(estadosPopulacao3 + " ");

        Collection<Integer> populacao = estadosPopulacao.values();
        String maiorPopulacao = "";
        String menorPopulacao = "";
        for (Map.Entry<String, Integer> entry : estadosPopulacao2.entrySet()){
            if (entry.getValue().equals(Collections.max(populacao))) maiorPopulacao = entry.getKey();
            if (entry.getValue().equals(Collections.min(populacao))) menorPopulacao = entry.getKey();
        }
        System.out.printf("Exiba o estado com o menor população (%s) e seu respectivo valor (%d)\n",
                menorPopulacao, Collections.min(populacao));
        System.out.printf("Exiba o estado com a maior população (%s) e seu respectivo valor (%d)\n",
                maiorPopulacao, Collections.max(populacao));

        int sum = 0;
        Iterator<Integer> iterator = estadosPopulacao2.values().iterator();
        while (iterator.hasNext()) {
            sum += iterator.next();
        }
        System.out.println("Exiba a soma da população desses estados: " + sum);

        System.out.println("Exiba a média da população desses estados: " + sum/estadosPopulacao2.size());

        System.out.println("Remova a população menor que 4.000.000: ");
        Iterator<Integer> iterator1 = estadosPopulacao2.values().iterator();
        while (iterator1.hasNext()) {
            if (iterator1.next() <= 4000000) iterator1.remove();
        }
        System.out.println(estadosPopulacao2);

        System.out.println("Confira se o dicionário está vazio: " + estadosPopulacao2.isEmpty());

    }
}
