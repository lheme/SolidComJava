package br.com.lheme.solid.ae.acao;

import br.com.lheme.solid.ae.model.Fatura;
import br.com.lheme.solid.ae.model.NotaFiscal;

/*
Aqui no gerador diminuimos o acoplamento e mantesmos estável a implementação
usando a Interface AcoesAposGerarNota
 */
import java.util.List;

public class GeradorDeNotaFiscal {

    private List<AcaoAposGerarNota> acoes;

    public GeradorDeNotaFiscal(List<AcaoAposGerarNota> acoes) {
        this.acoes = acoes;
    }

    public NotaFiscal gera(Fatura fatura) {
        double valor = fatura.getValorMensal();
        NotaFiscal nf = new NotaFiscal(valor, impostoSobreO(valor));

        for(AcaoAposGerarNota acaoAposGerarNota : acoes) {
            acaoAposGerarNota.executa(nf);
        }
        return nf;
    }

    private double impostoSobreO(double valor) {
        return valor * 0.06;
    }
}
