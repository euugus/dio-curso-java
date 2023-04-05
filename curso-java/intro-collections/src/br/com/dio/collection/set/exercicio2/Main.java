package br.com.dio.collection.set.exercicio2;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Main {

    public static void main(String[] args) {

        Set<LinguagemFavorita> linguagem = new HashSet<>(){{
           add(new LinguagemFavorita("Java", 1991, "Intellij"));
           add(new LinguagemFavorita("C#", 1999, "Visual Studio"));
           add(new LinguagemFavorita("Python", 1991, "PyCharm"));
        }};

        System.out.println("Ordem de Inserção:");
        for (LinguagemFavorita linguagemF : linguagem) System.out.print(linguagemF.getNome()
        + " " + linguagemF.getAnoDeCriacao() + " " + linguagemF.getIde() + " \n");

        System.out.println();

        System.out.println("Ordem Natural (Nome)");
        Set<LinguagemFavorita> linguagem1 = new TreeSet<>(new ComparatorNome());
        linguagem1.addAll(linguagem);
        for (LinguagemFavorita linguagemF : linguagem1) System.out.print(linguagemF.getNome()
        + " " + linguagemF.getAnoDeCriacao() + " " + linguagemF.getIde() + " \n");

        System.out.println();

        System.out.println("Ordem de IDE");
        Set<LinguagemFavorita> linguagem2 = new TreeSet<>(new ComparatorIde());
        linguagem2.addAll(linguagem);
        for (LinguagemFavorita linguagemF : linguagem2) System.out.print(linguagemF.getNome()
        + " " + linguagemF.getAnoDeCriacao() + " " + linguagemF.getIde() + " \n");

        System.out.println();

        System.out.println("Nome/ Ano de Criação/ Ide");
        Set<LinguagemFavorita> linguagem3 = new TreeSet<>(new ComparatorAnoNome());
        linguagem3.addAll(linguagem);
        for (LinguagemFavorita linguagemF : linguagem3) System.out.print(linguagemF.getNome()
        + " " + linguagemF.getAnoDeCriacao() + " " + linguagemF.getIde() + " \n");

        System.out.println();

        System.out.println("Nome/ Ano de Criação/ Ide");
        Set<LinguagemFavorita> linguagem4 = new TreeSet<>(new ComparatorNomeAnoIdade());
        linguagem4.addAll(linguagem);
        for (LinguagemFavorita linguagemF : linguagem4) System.out.print(linguagemF.getNome()
        + " " + linguagemF.getAnoDeCriacao() + " " + linguagemF.getIde() + " \n");

        System.out.println();

        System.out.println("Exiba as linguagens uma abaixo da outra:");
        for (LinguagemFavorita linguagemF : linguagem4) System.out.println(linguagemF.getNome());

    }

}
