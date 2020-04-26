package br.com.lheme.solid.hlsp;

import java.util.Arrays;
import java.util.List;

public class ProcessadorDeInvestimentos {

    public static void main(String[] args) {
        for (ContaComum conta : constasDoBanco()) {
            conta.rende();

            System.out.println("Novo saldo:");
            System.out.println(conta.getSaldo());
        }
    }

    private static List<ContaComum> constasDoBanco() {
        return Arrays.asList(umaContaCom(100), umaContaCom(150), umaContaCom(200));
    }

    private static ContaDeEstudante contaDeEstudanteCom(double amount) {
        ContaDeEstudante c = new ContaDeEstudante();
        c.deposita(amount);
        return c;
    }

    private static ContaComum umaContaCom(double amount) {
        ContaComum c = new ContaComum();
        c.deposita(amount);
        return c;
    }
}
