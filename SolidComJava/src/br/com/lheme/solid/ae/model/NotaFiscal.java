package br.com.lheme.solid.ae.model;

public class NotaFiscal {

    private int id;
    private double valorBruto;
    private double imposto;

    public NotaFiscal(int id, double valorBruto, double imposto) {
        this.id = id;
        this.valorBruto = valorBruto;
        this.imposto = imposto;
    }

    public NotaFiscal(double valorBruto, double imposto) {
        this(0, valorBruto, imposto);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getValorBruto() {
        return valorBruto;
    }

    public void setValorBruto(double valorBruto) {
        this.valorBruto = valorBruto;
    }

    public double getImposto() {
        return imposto;
    }

    public void setImposto(double imposto) {
        this.imposto = imposto;
    }
}
