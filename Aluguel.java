package aluguelGenerics;

import aluguelGenerics.pessoa.*;

public class Aluguel <T extends Alugavel> {
    public double orcaPreco(T alugavel, Pessoa cliente, int dias) {
        return (1 - cliente.calculaDesconto(dias)) * alugavel.valorDiaria() * dias;
    }
}