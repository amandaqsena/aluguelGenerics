package aluguelGenerics.veiculo;

import aluguelGenerics.Alugavel;

public class CarroMedio implements Veiculo, Alugavel {
    final double valorBase = 150;

    public double valorDiaria() {
        return this.valorBase;
    }
}