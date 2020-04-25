package br.com.lheme.solid.model;

import br.com.lheme.solid.regras.DezOuVintePorcento;
import br.com.lheme.solid.regras.QuinzeOuVinteCincoPorcento;
import br.com.lheme.solid.regras.RegraDeCalculo;

public enum Cargo {
    DESENVOLVEDOR (new DezOuVintePorcento()),
    DBA (new QuinzeOuVinteCincoPorcento()),
    TESTER(new QuinzeOuVinteCincoPorcento());

    private RegraDeCalculo regra;

    Cargo(RegraDeCalculo regra) {
        this.regra = regra;
    }

    public RegraDeCalculo getRegra() {
        return regra;
    }
}
