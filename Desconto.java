package aluguelGenerics;

import aluguelGenerics.pessoa.*;

public class Desconto {
    private int diasNecessariosProDesconto;
    private double valorDesconto;

    public double calculaDesconto(Pessoa cliente, int dias) {
        if (cliente instanceof Fisica){
            this.diasNecessariosProDesconto = 5;
            this.valorDesconto = 0.05;
        } else if (cliente instanceof Juridica) {
            diasNecessariosProDesconto = 3;
            valorDesconto = 0.05;
        }
            
        if (dias >= diasNecessariosProDesconto) {
            return valorDesconto;
        }
        return 0;
    }

}
