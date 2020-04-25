package br.com.lheme.solid.calculadora;

import br.com.lheme.solid.model.Funcionario;

public class CalculadoraDeSalario {

    public double calcula(Funcionario funcionario) {
        return funcionario.calcularSalario();
    }
}
