package aluguelGenerics;

import aluguelGenerics.pessoa.*;

public class Aluguel <T extends Alugavel> {

    private Double valorOrcado;
    private T alugavel;
    private Pessoa cliente;
    private int dias;

    public Aluguel(T alugavel, Pessoa cliente, int dias) {

        this.alugavel = alugavel;
        this.cliente = cliente;
        this.dias = dias;
    }

    public double orcaPreco() {
        Desconto desconto = new Desconto();
        valorOrcado = (1 - desconto.calculaDesconto(cliente, dias)) * alugavel.valorDiaria() * dias;
        return valorOrcado;
    }

    public String toString(){
        return String.valueOf(this.orcaPreco()) + " por " + String.valueOf(this.dias) + " dias.";
    }

    public Pessoa getCliente(){
        return this.cliente;
    }

    


}