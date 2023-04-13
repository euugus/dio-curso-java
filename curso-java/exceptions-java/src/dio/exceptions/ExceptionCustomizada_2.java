package dio.exceptions;

import javax.swing.*;

public class ExceptionCustomizada_2 {
    public static void main(String[] args){
        int[] numerador = {4, 5, 8, 10};
        int[] denominador = {2, 4, 0, 2, 8};

        for (int i = 0; i < denominador.length; i++) {
            try {
                if (numerador[i] % 2 != 0) {
                    throw new DivisaoNaoExataException("Divisão não exata!", numerador[i], denominador[i]);
                }

                int resultado = numerador[i] / denominador[i];
                System.out.println(resultado);
            }
            catch (DivisaoNaoExataException | ArithmeticException | ArrayIndexOutOfBoundsException e){
//                e.printStackTrace();
                JOptionPane.showMessageDialog(null, e.getMessage());
            }
//            catch (ArithmeticException e){
////                e.printStackTrace();
//                JOptionPane.showMessageDialog(null, "Impossível dividir por 0");
//            }
//            catch (ArrayIndexOutOfBoundsException e){
////                e.printStackTrace();
//                JOptionPane.showMessageDialog(null, "Erro no tamanho do array");
//            }
        }

        System.out.println("O programa continua...");
    }
}
