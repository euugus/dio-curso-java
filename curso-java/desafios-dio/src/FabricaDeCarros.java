import java.util.Scanner;

public class FabricaDeCarros {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int custoFabrica = sc.nextInt();
        int porcentagemDistribuidor = sc.nextInt();
        int porcentagemImpostos = sc.nextInt();

        int valorFinal = custoFabrica + (custoFabrica * porcentagemDistribuidor) / 100
        + (custoFabrica * porcentagemImpostos / 100);

        System.out.println(valorFinal);

    }

}
