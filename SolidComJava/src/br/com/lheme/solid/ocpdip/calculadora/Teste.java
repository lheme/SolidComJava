package br.com.lheme.solid.ocpdip.calculadora;

public class Teste {

    public static void main(String[] args) {
        TabelaDePreco tabela = new TabelaDePrecoDiferenciado();
        ServicoDeEntrega frete = new Frete();

        new CalculadoraDePrecos(tabela, frete);
    }
}
