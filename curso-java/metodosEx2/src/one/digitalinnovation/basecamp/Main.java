package one.digitalinnovation.basecamp;

public class Main {

    public static void main(String[] args) {

//      System.out.println("Exercício quadrilátero");
//      Quadrilatero.area(3);
//      Quadrilatero.area(5d,5d);
//      Quadrilatero.area(7,8,9);
//      Quadrilatero.area(5f,5f);


        System.out.println("Exercícios retornos");

        double areaQuadrado = Quadrilatero.area(3);
        System.out.println("Área do quadrado = " + areaQuadrado);

        double areaRetangulo = Quadrilatero.area(5, 5);
        System.out.println("Área do retângulo = " + areaRetangulo);

        double areaTrapezio = Quadrilatero.area(7,8,9);
        System.out.println("Área do trapézio = " + areaTrapezio);


    }

}
