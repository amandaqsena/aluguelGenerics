package aluguelGenerics.imovel;

import aluguelGenerics.Alugavel;

public class Casa extends Imovel implements Alugavel {

    private double taxaPorm2 = 20;
    private double taxaPorQuarto = 75;
    public double valorDiaria(){
        return this.multiplicadorBairro() * this.taxaPorm2 
                * this.area + this.quartos * this.taxaPorQuarto;
    }
    
}
