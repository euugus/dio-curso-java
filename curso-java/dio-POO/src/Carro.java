class Carro {

    String cor;
    String modelo;
    int capacidadeTanque;

    public Carro() {
    }

    public Carro(String cor, String modelo, int capacidadeTanque){
        this.cor = cor;
        this.modelo = modelo;
        this.capacidadeTanque = capacidadeTanque;
    }

    public void setCor(String cor){
        this.cor = cor;
    }

    String getCor(){
        return cor;
    }

    public void setModelo(String modelo){
        this.modelo = modelo;
    }

    String getModelo(){
        return modelo;
    }

    public void setCapacidadeTanque(int capacidadeTanque) {
        this.capacidadeTanque = capacidadeTanque;
    }

    int getCapacidadeTanque(){
        return capacidadeTanque;
    }

    public double valorTotalTanque(double valorCombustivel){
        return capacidadeTanque * valorCombustivel;
    }


}
