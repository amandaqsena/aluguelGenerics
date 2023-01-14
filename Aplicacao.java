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

        
        Aluguel<Alugavel> aluguel = new Aluguel<>();
        List<Double> testes = List.of(aluguel.orcaPreco(fusquinha, amanda, 3),
                aluguel.orcaPreco(fusquinha, amanda, 5),
                aluguel.orcaPreco(fusquinha, boikobank, 3),
                aluguel.orcaPreco(fusquinha, boikobank, 5),
                aluguel.orcaPreco(civic, amanda, 3),
                aluguel.orcaPreco(civic, amanda, 5),
                aluguel.orcaPreco(jeep, boikobank, 3),
                aluguel.orcaPreco(jeep, boikobank, 5)
        );

        testes.forEach(System.out::println);


    }
}