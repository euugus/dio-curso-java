package br.com.dio.collection.set.exercicio1;

import java.util.Comparator;
import java.util.Objects;

public class ArcoIris {

    private String cor;

    public ArcoIris() {
    }

    public ArcoIris(String cor) {
        this.cor = cor;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ArcoIris arcoIris = (ArcoIris) o;
        return cor.equals(arcoIris.cor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cor);
    }

    @Override
    public String toString() {
        return "cor = " + cor;
    }
}

class ComparatorCor implements Comparator<ArcoIris>{
    @Override
    public int compare(ArcoIris l1, ArcoIris l2) {
        return l1.getCor().compareTo(l2.getCor());
    }
}
