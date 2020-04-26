package br.com.lheme.solid.srp.model;

import br.com.lheme.solid.srp.regras.DezOuVintePorcento;
import br.com.lheme.solid.srp.regras.QuinzeOuVintePorcento;
import br.com.lheme.solid.srp.regras.RegraDeCalculo;

public enum Cargo {
    DESENVOLVEDOR(new DezOuVintePorcento()),
    DBA(new QuinzeOuVintePorcento()),
    TESTER(new QuinzeOuVintePorcento());

    private RegraDeCalculo regra;

    Cargo(RegraDeCalculo regra){
        this.regra = regra;
    }

    public RegraDeCalculo getRegra() {
        return regra;
    }
}
