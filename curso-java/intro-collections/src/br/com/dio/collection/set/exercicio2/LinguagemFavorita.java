package br.com.dio.collection.set.exercicio2;

import java.util.Comparator;
import java.util.Objects;

public class LinguagemFavorita {

    private String nome;
    private int anoDeCriacao;
    private String ide;

    public LinguagemFavorita() {
    }

    public LinguagemFavorita(String nome, int anoDeCriacao, String ide) {
        this.nome = nome;
        this.anoDeCriacao = anoDeCriacao;
        this.ide = ide;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getAnoDeCriacao() {
        return anoDeCriacao;
    }

    public void setAnoDeCriacao(int anoDeCriacao) {
        this.anoDeCriacao = anoDeCriacao;
    }

    public String getIde() {
        return ide;
    }

    public void setIde(String ide) {
        this.ide = ide;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LinguagemFavorita that = (LinguagemFavorita) o;
        return anoDeCriacao == that.anoDeCriacao && nome.equals(that.nome) && ide.equals(that.ide);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, anoDeCriacao, ide);
    }

}

class ComparatorNome implements Comparator<LinguagemFavorita>{

    @Override
    public int compare(LinguagemFavorita l1, LinguagemFavorita l2) {
        return l1.getNome().compareTo(l2.getNome());
    }
}

class ComparatorIde implements Comparator<LinguagemFavorita>{

    @Override
    public int compare(LinguagemFavorita l1, LinguagemFavorita l2) {
        int resultado = l1.getIde().compareTo(l2.getIde());
        if (resultado == 0){
            resultado = l1.getNome().compareTo(l2.getNome());
            if (resultado == 0){
                resultado = Integer.compare(l1.getAnoDeCriacao(), l2.getAnoDeCriacao());
            }
        }
        return resultado;
    }
}

class ComparatorAnoNome implements Comparator<LinguagemFavorita> {

    @Override
    public int compare(LinguagemFavorita l1, LinguagemFavorita l2) {
         int resultado = Integer.compare(l1.getAnoDeCriacao(), l2.getAnoDeCriacao());
         if (resultado == 0){
             resultado = l1.getNome().compareTo(l2.getNome());
         }
         return resultado;
    }
}

class ComparatorNomeAnoIdade implements Comparator<LinguagemFavorita>{

    @Override
    public int compare(LinguagemFavorita l1, LinguagemFavorita l2) {
        int resultado = l1.getNome().compareTo(l2.getNome());
        if (resultado != 0) {
            return resultado;
        }
        resultado = Integer.compare(l1.getAnoDeCriacao(), l2.getAnoDeCriacao());
        if (resultado != 0){
            return resultado;
        }

        return l1.getIde().compareTo(l2.getIde());

    }
}

