package br.com.dio.collection.map;

import java.util.*;

public class ExemploMap {

    public static void main(String[] args) {

        System.out.println("Crie um dicionário que relacione os modelos e seus consumos:");
        Map<String, Double> carrosPopulares = new HashMap<>(){{
            put("Gol", 14.4);
            put("Uno", 15.6);
            put("Mobi", 16.1);
            put("Hb20", 14.5);
            put("Kwid", 15.6);
        }};
        System.out.println(carrosPopulares);

        System.out.println("Substitua o consumo do gol por 15,2 mk/l:");
        carrosPopulares.put("Gol", 15.2);
        System.out.println(carrosPopulares);

        System.out.println("Confira se o modelo Tucson está no dicionário: " + carrosPopulares.containsKey("Tucson"));

        System.out.println("Exiba o consumo do Uno " + carrosPopulares.get("Uno"));

        //System.out.println("Exiba o terceiro modelo adicionado:");

        System.out.println("Exiba os modelos: " + carrosPopulares.keySet());

        System.out.println("Exiba os consumos dos carros: " + carrosPopulares.values());

        System.out.println("Exiba o modelo mais econômico e seu consumo: ");
        Double melhorConsumo = Collections.max(carrosPopulares.values());
        Set<Map.Entry<String, Double>> entries =  carrosPopulares.entrySet();
        String modeloMaisEficiente = "";

        for (Map.Entry<String, Double> entry : entries) {
            if (entry.getValue().equals(melhorConsumo)) {
                modeloMaisEficiente = entry.getKey();
                System.out.println("Modelo mais eficiente: " + modeloMaisEficiente + " - " + melhorConsumo);
            }
        }

        System.out.println("Exiba o modelo menos econômico e seu consumo:");
        Double piorConsumo = Collections.min(carrosPopulares.values());
        String modeloMenosEficiente = "";
        for (Map.Entry<String, Double> entry :carrosPopulares.entrySet()){
            if (entry.getValue().equals(piorConsumo)) {
                modeloMenosEficiente = entry.getKey();
                System.out.println("Modelo menos eficiente: " + modeloMenosEficiente + " - " + piorConsumo);
            }
        }

        Iterator<Double> iterator = carrosPopulares.values().iterator();
        Double sum = 0d;
        while (iterator.hasNext()){
            sum += iterator.next();
        }
        System.out.println("Exiba a soma dos consumos: " + sum);

        System.out.println("Exiba a média dos consumos deste dicionário de carros: " + (sum/carrosPopulares.size()));

        System.out.println("Remova os modelos com o consumo igual a 15,6 km/l");
        Iterator<Double> iterator1 = carrosPopulares.values().iterator();
        while (iterator1.hasNext()){
            if (iterator1.next().equals(15.6)) iterator1.remove();
        }
        System.out.println(carrosPopulares);

        System.out.println("Exiba todos os carros na ordem em que foram informados: ");

        Map<String, Double> carrosPopulares1 = new LinkedHashMap<>(){{
            put("Gol", 14.4);
            put("Uno", 15.6);
            put("Mobi", 16.1);
            put("Hb20", 14.5);
            put("Kwid", 15.6);
        }};
        System.out.println(carrosPopulares1);

        System.out.println("Exiba o dicionário ordenado pelo modelo: ");
        Map<String, Double> carrosPopulares2 = new TreeMap<>(carrosPopulares1);
        System.out.println(carrosPopulares2.toString());

        System.out.println("Apague o dicionário de carros: ");
        carrosPopulares.clear();

        System.out.println("Confira se o dicionário está vazio: "+ carrosPopulares.isEmpty());

    }

}
