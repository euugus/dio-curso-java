public class Main {

    public static void main(String[] args) {

        Carro carro = new Carro();

        carro.setCor("Prata");
        carro.setModelo("Range Rover Evoque");
        carro.setCapacidadeTanque(40);

        System.out.println("O calculo para encher o tanque da " + carro.getModelo() + " " +
        carro.getCor() + " é de " + carro.valorTotalTanque(4.50));

        Carro carro1 = new Carro("Preto", "BMW",60);

        System.out.println(carro1.getModelo());
        System.out.println(carro1.getCor());
        System.out.println(carro1.getCapacidadeTanque());
        System.out.println(carro1.valorTotalTanque(6.0));



    }

}
