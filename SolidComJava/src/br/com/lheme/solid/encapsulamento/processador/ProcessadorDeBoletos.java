package br.com.lheme.solid.encapsulamento.processador;

import br.com.lheme.solid.encapsulamento.model.Boleto;
import br.com.lheme.solid.encapsulamento.model.Fatura;
import br.com.lheme.solid.encapsulamento.model.MeioDePagamento;
import br.com.lheme.solid.encapsulamento.model.Pagamento;

import java.util.List;

public class ProcessadorDeBoletos {

    public  void processa(List<Boleto> boletos, Fatura fatura) {
        for (Boleto boleto : boletos) {
            Pagamento pagamento = new Pagamento(boleto.getValor(),
                    MeioDePagamento.BOLETO);
            fatura.adicionaPagamento(pagamento);
        }
    }

}
