package aluguelGenerics.veiculo;

import aluguelGenerics.Alugavel;

public class SUV implements Veiculo, Alugavel {
final double valorBase = 200;

    public double valorDiaria() {
        return this.valorBase;
    }
}