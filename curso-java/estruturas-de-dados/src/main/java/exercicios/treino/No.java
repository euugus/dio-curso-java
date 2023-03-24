package exercicios.treino;

public class No {

    private Double value;
    private No refNext;

    public Double getValue() {
        return value;
    }

    public void setValue(Double value) {
        this.value = value;
    }

    public No getRefNext() {
        return refNext;
    }

    public void setRefNext(No refNext) {
        this.refNext = refNext;
    }
}
