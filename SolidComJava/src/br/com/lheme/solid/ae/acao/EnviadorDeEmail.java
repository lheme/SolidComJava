package br.com.lheme.solid.ae.acao;

import br.com.lheme.solid.ae.model.NotaFiscal;

public class EnviadorDeEmail implements AcaoAposGerarNota{
    @Override
    public void executa(NotaFiscal nf) {
        System.out.println("envia email da nf " + nf.getId());
    }
}
