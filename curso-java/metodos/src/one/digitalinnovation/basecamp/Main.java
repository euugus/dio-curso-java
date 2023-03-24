package one.digitalinnovation.basecamp;

public class Main {

    public static void main(String[] args) {
        //Calculadora
        System.out.println("Exercício calculadora");
        Calculadora.soma(3, 6);
        Calculadora.subtracao(3, 6);
        Calculadora.multiplicacao(3, 6);
        Calculadora.divisao(3, 6);
        System.out.println();
        System.out.println();

        // Mensagem
        System.out.println("Exercício mensagem");
        Mensagem.obterMensagem(9);
        Mensagem.obterMensagem(14);
        Mensagem.obterMensagem(1);
        Mensagem.obterMensagem(25);
        System.out.println();
        System.out.println();

        // Empréstimo
        System.out.println("Exercício empréstimo");
        Emprestimo.calcular(1000, Emprestimo.getDuasParcelas());
        Emprestimo.calcular(1000, Emprestimo.getTresParcelas());
        Emprestimo.calcular(1000, 5);

    }

}
