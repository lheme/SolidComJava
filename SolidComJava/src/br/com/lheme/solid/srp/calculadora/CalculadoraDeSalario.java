package br.com.lheme.solid.srp.calculadora;

import br.com.lheme.solid.srp.model.Funcionario;

/*
Esta classe contem a implementação referente a ou Single Responsability Principle
Os cálculos percentuais de salários foram retirados dessa classe e colocado seperados
 */
public class CalculadoraDeSalario {

    public double calcula(Funcionario funcionario) {
        return funcionario.calcularSalario();
    }
}
