package aluguelGenerics.imovel;

import aluguelGenerics.Alugavel;

public class Apartamento extends Imovel implements Alugavel {
    private double taxaPorm2 = 40;
    private double taxaPorQuarto = 50;
    public double valorDiaria(){
        return this.multiplicadorBairro() * this.taxaPorm2 
                * this.area + this.quartos * this.taxaPorQuarto;
    }
}
