package aluguelGenerics;

import java.util.List;

import aluguelGenerics.pessoa.Fisica;
import aluguelGenerics.pessoa.Juridica;
import aluguelGenerics.pessoa.Pessoa;
import aluguelGenerics.veiculo.CarroMedio;
import aluguelGenerics.veiculo.CarroPequeno;
import aluguelGenerics.veiculo.SUV;

public class Aplicacao {
    public static void main(String[] args) {
        Alugavel fusquinha = new CarroPequeno();
        Alugavel civic = new CarroMedio();
        Alugavel jeep = new SUV();

        Pessoa amanda = new Fisica();
        Pessoa boikobank = new Juridica();

        
        List<Aluguel<Alugavel>> aluguelVeiculos = List.of(
                new Aluguel<>(fusquinha, amanda, 3),
                new Aluguel<>(fusquinha, amanda, 5),
                new Aluguel<>(fusquinha, boikobank, 3),
                new Aluguel<>(fusquinha, boikobank, 5),
                new Aluguel<>(civic, amanda, 3),
                new Aluguel<>(civic, amanda, 5),
                new Aluguel<>(jeep, boikobank, 3),
                new Aluguel<>(jeep, boikobank, 5)
        );

        Historico historico = new Historico();
        aluguelVeiculos.forEach(it-> historico.adicionarHistorico(it.getCliente(), it));
        System.out.println(historico.getHistorico(amanda));
        System.out.println("ALUGUEL DE VEICULOS");
        //aluguelVeiculos.forEach(it-> System.out.println(it.orcaPreco()));



    }
}