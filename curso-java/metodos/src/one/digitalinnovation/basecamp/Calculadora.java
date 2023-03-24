package one.digitalinnovation.basecamp;

public class Calculadora {

    public static void soma(double n1, double n2){
        double resultado = n1 + n2;
        System.out.println("A soma de " + n1 + " + " + n2 + " é = " + resultado);
    }
    public static void subtracao(double n1, double n2){
        double resultado = n1 - n2;
        System.out.println("A subtracao de " + n1 + " - " + n2 + " é = " + resultado);
    }
    public static void multiplicacao(double n1, double n2){
        double resultado = n1 * n2;
        System.out.println("A multiplicacao de " + n1 + " * " + n2 + " é = " + resultado);
    }
    public static void divisao(double n1, double n2){
        double resultado = n1 / n2;
        System.out.println("A divisao de " + n1 + " * " + n2 + " é = " + resultado);
    }

}
