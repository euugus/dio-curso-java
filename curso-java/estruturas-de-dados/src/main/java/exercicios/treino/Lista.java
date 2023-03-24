package exercicios.treino;

public class Lista {

    private No primeiroNo;

    public void adicionar(Double value){
        No no = new No();
        no.setValue(value);
        no.setRefNext(primeiroNo);
        primeiroNo = no;
    }

    @Override
    public String toString() {
        StringBuffer sb = new StringBuffer();
        sb.append("[");

        No p = primeiroNo;
        while(p != null){
            sb.append(p.getValue() + " ");
            p = p.getRefNext();
        }

        sb.append("]");
        return sb.toString();

    }

}
