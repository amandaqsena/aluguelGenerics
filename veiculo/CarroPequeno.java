package aluguelGenerics.veiculo;

import aluguelGenerics.Alugavel;

public class CarroPequeno implements Veiculo, Alugavel {
    
    final double valorBase = 100;

    public double valorDiaria() {
        return this.valorBase;
    }
}