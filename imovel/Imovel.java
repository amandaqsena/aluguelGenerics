package aluguelGenerics.imovel;

public abstract class Imovel {
    protected int quartos;
    protected Bairro bairro;
    protected double area;
    protected double taxaPorm2;
    protected double taxaPorQuarto;
    protected double multiplicadorBairro(){
        switch(this.bairro) {
            case PlanoPiloto: return 0.8;
            case Ceilandia: return 0.5;
            case LagoSul: return 1;
        }
        throw new IllegalArgumentException("Bairro inválido");
    }
}
